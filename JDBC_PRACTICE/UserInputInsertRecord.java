package com.expleo.MavenProjectnew;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInputInsertRecord {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "jeevika";

        String insertSQL = "INSERT INTO oracle_demo.EmployeeTable1 (id, name, salary, department) VALUES (?, ?, ?, ?)";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                 PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            	Scanner sc=new Scanner(System.in);
        		for(int i=1;i<=5;i++) {
        			System.out.println("Enter details for employees"+i+":");
        			
        			System.out.println("id:");
        			int id=sc.nextInt();
        			sc.nextLine();
        			
        			System.out.println("Name:");
        			String name=sc.nextLine();
        			
        			System.out.println("Salary:");
        			double salary=sc.nextDouble();
        			sc.nextLine();
        			
        			System.out.println("Department");
        			String department=sc.nextLine();
        			
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setDouble(3, salary);
                pstmt.setString(4, department);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Record inserted successfully");
                }
            }
        } }catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred");
            e.printStackTrace();
        }
        }
}

