package org.jsp.jdbcdemo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegister {
	public static void main(String[] args) {
		try {
			Driver d= new Driver();
			System.out.println("Driver class Loaded");
			DriverManager.registerDriver(d);
			System.out.println("Driver class registerd");	
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
