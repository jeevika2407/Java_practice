package com.expleo.MavenProjectnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "jeevika";
        String deleteSQL = "DELETE FROM oracle_demo.EmployeeTable1 WHERE ID=?";

        try (Scanner sc = new Scanner(System.in)) {
            try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                 PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

                System.out.println("Enter the Employee ID to delete: ");
                int empId = sc.nextInt();

                pstmt.setInt(1, empId);
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Employee with ID " + empId + " deleted successfully.");
                } else {
                    System.out.println("No employee found with ID " + empId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
