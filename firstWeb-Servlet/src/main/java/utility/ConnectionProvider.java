package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getConnection() {
		Connection conn=null;
		
		// 1. load the driver -- is id building bridge between java and mysql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			//2. open the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch66","root","0111");
			//3. issueing the query
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			return conn;
		}
	}
}
