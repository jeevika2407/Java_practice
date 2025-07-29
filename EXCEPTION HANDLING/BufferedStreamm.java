package com.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedStreamm {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter a string:");
            String str = br.readLine();
            
            System.out.println("Enter an integer:");
            int n = Integer.parseInt(br.readLine());
            
            System.out.println("Enter a float:");
            float ft = Float.parseFloat(br.readLine());
            
            System.out.println("Enter a short:");
            short sht = Short.parseShort(br.readLine());
            
            System.out.println("Enter a double:");
            double dub = Double.parseDouble(br.readLine());
            
            System.out.println("Enter a long:");
            long log = Long.parseLong(br.readLine());
            
            System.out.println("Enter a character:");
            char ch = (char) br.read();
            br.readLine();
            
            System.out.println("Enter a byte:");
            byte byt = Byte.parseByte(br.readLine());
            
            System.out.println("\nThe values you entered are:");
            System.out.println("String: " + str);
            System.out.println("Integer: " + n);
            System.out.println("Float: " + ft);
            System.out.println("Short: " + sht);
            System.out.println("Double: " + dub);
            System.out.println("Long: " + log);
            System.out.println("Character: " + ch);
            System.out.println("Byte: " + byt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
