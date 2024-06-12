package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

// Inserting data into the table using PreparedStatement
// prepared statements are used when we want to take inputs from the user in the query;

public class InsertDynamicQuery {

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
			
			//Create query
			String q = "insert into table1(tName, tCity) values(?,?)";
			
			//get the PreparedStatement object
			PreparedStatement pstmt =con.prepareStatement(q);
			
			// set the values to query
			pstmt.setString(1, "Nikhitha");
			pstmt.setString(2, "Nalgonda");
			
			pstmt.executeUpdate();
			System.out.println("Inserted...");
			con.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}


}
