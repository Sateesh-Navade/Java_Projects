package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String query = "create database jdbc_demo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// System.out.println("Driver Loaded And Register");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "admin");
//			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin")
			st = con.createStatement();
			boolean res = st.execute(query);
			System.out.println("Database Created");
			System.out.println(res);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// System.out.println("Invalid Credentials");
		} finally {
			if (con != null) {
				try {
					con.close();
					System.out.println("Connection has been closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				st.close();
				System.out.println("Statement has been closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
