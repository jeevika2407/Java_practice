package com.expleo.MavenProjectnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchDataExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "jeevika";

        String selectSQL = "SELECT id, name, salary, department FROM oracle_demo.employeetable1";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {

                System.out.printf("%-5s %-20s %-10s %-15s%n", "ID", "Name", "Salary", "Department");
                System.out.println("-----------------------------------------------------------");

                while (rs.next()) {
                    int id = rs.getInt("ID");
                    String name = rs.getString("Name");
                    double salary = rs.getDouble("Salary");
                    String department = rs.getString("Department");

                    System.out.printf("%-5d %-20s %-10.2f %-15s%n", id, name, salary, department);
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
