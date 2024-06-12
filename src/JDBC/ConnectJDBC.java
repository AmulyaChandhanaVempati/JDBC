package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection:
			String url="jdbc:mysql://localhost:3306/vacspringdb";
			String username="root";
			String password="Amulya@741";
			
			Connection con = DriverManager.getConnection(url, username, password);
			if(con.isClosed()) {
				System.out.println("Connection Closed");
			}
			else {
				System.out.println("Connection Created...");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

