package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		String sql="update student set name='yash',perc=35.0 where id=9";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			st=con.createStatement();
			int r = st.executeUpdate(sql);
			System.out.println(r+" Row Updated ");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			//System.out.println("Invalid Credentials");
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
			try {
				st.close();
				System.out.println("Statement has been closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
