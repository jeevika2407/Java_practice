package com.expleo.MavenProjectnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBCExampleCreate {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "jeevika";

        String sqlCreate = "CREATE TABLE oracle_demo.EmployeeTable1 ("
                + "ID NUMBER(5) PRIMARY KEY, "
                + "NAME VARCHAR2(50), "
                + "SALARY NUMBER(10), "
                + "DEPARTMENT VARCHAR2(50))";

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            stmt = conn.createStatement();
            stmt.executeUpdate(sqlCreate);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) 
                    stmt.close();
                if (conn != null) 
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
