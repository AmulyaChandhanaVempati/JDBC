package JDBC;

import java.sql.*;

public class CreateTable {

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
			String q = "Create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";
			
			//Create statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created in DataBase");
			con.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
