package com.exception;

import java.util.*;
import java.lang.*;
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class ExceptionDemooo {
    public static void validate(String name) throws InvalidNameException {
        if (!name.matches("[a-zA-Z]+")) { 
            throw new InvalidNameException("Name is invalid");
        }
        System.out.println("Valid Employee Name: " + name);
    }
}

public class Easy03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            ExceptionDemooo.validate(name); 
        } 
        catch (InvalidNameException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } 
     
    }
}
