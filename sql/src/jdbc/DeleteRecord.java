package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

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
			Scanner sc=  new Scanner(System.in);	//used to take id input from the user
			System.out.println("Enter id");
			int id = sc.nextInt();
			
			PreparedStatement st = conn.prepareStatement("delete from user where userid=?");
			st.setInt(1, id);
			//4. executing the query
			int result = st.executeUpdate();
			
			//5. fetch the result
			if(result !=0)
				System.out.println("Record deleted Successfully");
			else
				System.out.println("Error in Commands");
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