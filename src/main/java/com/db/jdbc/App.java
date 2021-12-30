package com.db.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//
//
public class App {
  
	public static void main(String[] args) {
	  
//		   try {
//               Class.forName("com.mysql.cj.jdbc.Driver");
//               System.out.println("Loaded Driver class");
//       } catch (ClassNotFoundException e) {
//               e.printStackTrace();
//       }
//   Connection connection = null;
//   Statement stmt = null;
//   
//   try {
//          
//               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz_payrollservice", "root", "Jyotir@1998");
//               System.out.println("Got connected");
//               
//               stmt = connection.createStatement();
//              
////               String query = "insert into payroll_service(Name,Salary,Gender,StartDate) values('Satya', 30000, 'M','2021-12-12')";
//               String query = "delete from payroll_service where ID = '9'";
//               int result = stmt.executeUpdate(query);
//               if(result > 0 ) {
//                       System.out.println("Data got inserted");
//               }
//       } catch (SQLException e) {
//               e.printStackTrace();
//       }finally {
//               if(stmt != null) {
//                       try {
//                               stmt.close();
//                       } catch (SQLException e) {
//                               e.printStackTrace();
//                       }
//               }
//               if(connection != null) {
//                       try {
//                               connection.close();
//                       } catch (SQLException e) {
//                               e.printStackTrace();
//                       }
//               }
//       }
		EmployeePayroll_Service service = new EmployeePayroll_Service();
    	try {
			service.updateBasePay();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
  }
}
