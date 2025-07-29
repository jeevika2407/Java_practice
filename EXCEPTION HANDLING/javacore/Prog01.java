package com.javacore;
import java.util.*;

public class Prog01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int n = ch.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            char cur = ch[i];
            int count = 1;
            
            for (int j = i + 1; j < n; j++) {
                if (ch[j] == cur) {
                    found = true;
                    count++;
                    ch[j] = '#'; 
                }
            }
           
            if (found) {
                System.out.println(cur + ": " + count);
            }
        }

        if (!found) {
            System.out.println("no duplicates");
        }
    }
}




















//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class OracleJDBCExampleCreate {
//    public static void main(String[] args) {
//        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//        String username = "system";
//        String password = "jeevika";
//
//        String sqlCreate = "CREATE TABLE oracle_demo.EmployeeTable1 ("
//                + "ID NUMBER(5) PRIMARY KEY, "
//                + "NAME VARCHAR2(50), "
//                + "SALARY NUMBER(10), "
//                + "DEPARTMENT VARCHAR2(50))";
//
//        Connection conn = null;
//        Statement stmt = null;
//
//        try {
//            conn = DriverManager.getConnection(jdbcUrl, username, password);
//            stmt = conn.createStatement();
//            stmt.executeUpdate(sqlCreate);
//            System.out.println("Table created successfully");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (stmt != null) 
//                    stmt.close();
//                if (conn != null) 
//                    conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
