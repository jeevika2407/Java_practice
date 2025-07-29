package com.pack;

import java.sql.*;  // Import for JDBC
import java.util.Scanner; // Import Scanner class

public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roll: ");
        int roll = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter gender: ");
        String gender = sc.nextLine();

        System.out.println("Enter address: ");
        String address = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        
        // Close scanner to prevent resource leaks
        sc.close();

        try {
            // Step 1: Load Driver Class
            Class.forName("oracle.jdbc.OracleDriver");

            // Step 2: Create connection (Use correct username and password)
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "jeevika");

            // Step 3: Prepare SQL query
            String query = "INSERT INTO student (roll, name, gender, address, age) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, gender);
            ps.setString(4, address);
            ps.setInt(5, age); // Corrected from setString to setInt

            // Step 4: Execute SQL query
            int z = ps.executeUpdate();
            if (z > 0) {
                System.out.println("Record saved successfully");
            } else {
                System.out.println("Record not saved");
            }

            // Step 5: Close resources
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();  // Print the full error details for debugging
        }
    }
}
