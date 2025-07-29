package com.expleo.MavenProjectnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecordExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "jeevika";

        String updateSQL = "UPDATE oracle_demo.EmployeeTable1 SET Salary=? WHERE ID=?";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                 PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

                pstmt.setDouble(1, 80000.00);
                pstmt.setInt(2, 101);

                int rowsUpdated = pstmt.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Record updated successfully");
                } else {
                    System.out.println("No record found with the given ID");
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
