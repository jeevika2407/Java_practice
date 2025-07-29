package com.expleo.MavenProjectnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJDBCDemo {
    public static void main(String args[]) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "jeevika";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

            if (conn != null) {
                System.out.println("Connected to Oracle database successfully");
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
