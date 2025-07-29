package com.exception;

import java.io.*;

public class BufferedStream {
    public static void main(String args[]) {

        try (BufferedReader bufInput = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufOutput = new BufferedWriter(new FileWriter(args[1]))) {

            String line="";
            while ((line = bufInput.readLine()) != null) {
                bufOutput.write(line);
                bufOutput.newLine();
            }

        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f.getMessage());
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
