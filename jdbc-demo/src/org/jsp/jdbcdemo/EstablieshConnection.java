package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablieshConnection {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded And Register");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","admin");
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin")
			System.out.println("Connection Has Been Eshtablished");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Invalid Credentials");
		}
		finally {
			if (con!=null) {
				try {
					con.close();
					System.out.println("Connection has been closed");
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}
