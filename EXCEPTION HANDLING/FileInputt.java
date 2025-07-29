package com.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputt {
    public static void main(String args[]) {
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\kirub\\eclipse-workspace\\ExceptionHandling\\src\\com\\exception\\input.txt");
            System.out.println("Data in the file:");
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
                System.out.println(input.available());   //keeps on decreasing 66 65 64....0
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}




