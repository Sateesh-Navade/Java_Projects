package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String query = "create table student(" + "id int not null," + "age int not null,"
				+ "phone bigint(20) not null unique," + "perc decimal not null," + "name varchar(45) not null,"
				+ "primary key(id))";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// System.out.println("Driver Loaded And Register");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
//			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin")
			st = con.createStatement();
			boolean res = st.execute(query);
			System.out.println("Student Table Created");
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
