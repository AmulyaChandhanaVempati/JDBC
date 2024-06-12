package JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateJDBC {

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
			
			String q = "update table1 set tName=?, tCity=? where tId=?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name :");
			String name = br.readLine();
			System.out.println("Enter City :");
			String city = br.readLine();
			System.out.println("Enter Id :");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement psstmt = con.prepareStatement(q);
			psstmt.setString(1, name);
			psstmt.setString(2, city);
			psstmt.setInt(3, id);
			psstmt.executeUpdate();
			System.out.println("Updated....");
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
