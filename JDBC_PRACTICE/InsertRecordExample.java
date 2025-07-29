package com.expleo.MavenProjectnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "jeevika";

        String insertSQL = "INSERT INTO oracle_demo.EmployeeTable1 (id, name, salary, department) VALUES (?, ?, ?, ?)";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                 PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

                pstmt.setInt(1, 102);
                pstmt.setString(2, "jeev");
                pstmt.setDouble(3, 50000.00);
                pstmt.setString(4, "IT");

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Record inserted successfully");
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
