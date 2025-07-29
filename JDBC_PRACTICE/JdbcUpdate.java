package com.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUpdate {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "system";
        String password = "jeevika";

        String updateQuery = "UPDATE oracle_demo.employeess SET salary = 18000 WHERE department_id = 90 AND job_id = 'AD_VP'";
        String selectQuery = "SELECT first_name, last_name, job_id, department_id, salary FROM oracle_demo.employeess WHERE department_id = 90 AND job_id = 'AD_VP'";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
             PreparedStatement selectStmt = conn.prepareStatement(selectQuery)) {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println("Number of rows updated: " + rowsUpdated);

            try (ResultSet rs = selectStmt.executeQuery()) {
                System.out.println("Updated Employees:");
                while (rs.next()) {
                    System.out.println("First Name: " + rs.getString("first_name"));
                    System.out.println("Last Name: " + rs.getString("last_name"));
                    System.out.println("Job ID: " + rs.getString("job_id"));
                    System.out.println("Department ID: " + rs.getInt("department_id"));
                    System.out.println("Salary: " + rs.getDouble("salary"));
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred");
            e.printStackTrace();
        }
    }
} 












