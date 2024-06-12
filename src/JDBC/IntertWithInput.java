package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
public class IntertWithInput {

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
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name: ");
			String name = br.readLine();
			System.out.println("Enter City: ");
			String city = br.readLine();
			
			// set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
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
