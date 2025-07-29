package com.exception;

//import java.nio.file.*;
//import java.io.IOException;

/*public class CreateDirectory {
    public static void main(String args[]) {
        try {
            Path path = Paths.get("C:\\Users\\kirub\\eclipse-workspace\\ExceptionHandling\\src\\com\\exception\\new.txt");

            if (!Files.exists(path)) {
                Files.createDirectory(path); 
                System.out.println("Directory created");
            } else {
                System.out.println("Directory already exists");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
*/


import java.nio.file.*;
import java.io.IOException;

public class CreateDirectory {
    public static void main(String args[]) {
        Path path = Paths.get("C:\\Users\\kirub\\eclipse-workspace\\ExceptionHandling\\src\\com\\exception\\newDirectory");

        try {
            Files.deleteIfExists(path); 
            System.out.println("File deleted if it existed.");
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
                                

