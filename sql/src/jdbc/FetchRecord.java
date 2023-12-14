package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecord {
	public static void main(String[] args) {
		Connection conn=null;
		
		// 1. load the driver -- is id building bridge between java and mysql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//url==jdbc:mysql://localhost:3306/batch66
		try {
			//2. open the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch66","root","0111");
			//3. issueing the query
			PreparedStatement st = conn.prepareStatement("select * from user");
			//4. executing the query
			ResultSet rs = st.executeQuery();
			
			//5. fetch the result
			while(rs.next())
				System.out.println("id= "+rs.getInt(1)+", Name= "+rs.getString(2)+", Email= "+rs.getString(3)+", Password= "+rs.getString(4));
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//6. close the connection
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//every database has its own driver