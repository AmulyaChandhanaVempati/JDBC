package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
	private static Connection con;
	
	public static Connection connect() {
		try {
			
			if(con == null) {
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection:
			String url="jdbc:mysql://localhost:3306/vacspringdb";
			String username="root";
			String password="Amulya@741";
			
			 con = DriverManager.getConnection(url, username, password);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

}
