package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudent {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet res=null;
		String sql="Select * from student";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			st=con.createStatement();
			System.out.println(st.executeQuery(sql));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			//System.out.println("Invalid Credentials");
		}
		finally {
			if (con!=null) {
				try {
					con.close();
					System.out.println("Connection has been Closed");
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
			if (res!=null) {
				try {
					con.close();
					System.out.println("ResultSet is Closed");
				}catch (SQLException e){
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
