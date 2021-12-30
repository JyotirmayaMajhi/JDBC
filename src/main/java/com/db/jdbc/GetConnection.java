package com.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	Connection connection = null;

	public Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded Driver class");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz_payrollservice", "root", "Jyotir@1998");
			System.out.println("Connection Established");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return connection;
	}
	
	public void closeConnection() {
		
		if (connection != null) {
			try {
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
