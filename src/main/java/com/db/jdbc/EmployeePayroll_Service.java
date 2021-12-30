package com.db.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeePayroll_Service {

	GetConnection connection = new GetConnection();
	
		
		public void show() throws SQLException {
			Connection conn = connection.getConnection();
			String query = "SELECT * FROM employee_payroll";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				String salary = rs.getString(4);
				String startdate = rs.getString(5);
				System.out.println("ID : "+ id + ", Name : "+ name + ", Gender : "+ gender + ", Salary : "+salary+
						", StartDate : " + startdate);
			}
			
			connection.closeConnection();
		}

	public void updateBasePay() throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection conn = connection.getConnection();
		System.out.println("Enter the employee Name");
		String name = sc.next();
		System.out.println("Enter the new BasePay");
		double basepay = sc.nextDouble();
		String query = "update payroll_service set basicpay="+basepay+" where name="+"'"+name+"'";
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate(query);
		if(i > 0) {
			System.out.println("Employee updated successsfully");
		}
		sc.close();
		stmt.close();
		connection.closeConnection();
		
	}
}
