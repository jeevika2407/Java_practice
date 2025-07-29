package com.exception;

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

class ExceptionDemo {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}

public class UserDefined {
    public static void main(String args[]) {
        try {
            ExceptionDemo.validate(13); 
        } catch (InvalidAgeException m) { 
            System.out.println("Exception occurred: " + m);
        }
        System.out.println("Rest of the code");
    }
}

