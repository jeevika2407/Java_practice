package com.javacore;
import java.util.*;

class AgeValidationException extends Exception {
    AgeValidationException(String m) {
        super(m);
    }
}

class ExceptionDemo {
    static void validateAge(int age) throws AgeValidationException {
        if (age < 1) {
            throw new AgeValidationException("Age is too low");
        } else if (age > 100) {
            throw new AgeValidationException("Age is too high");
        } else {
            System.out.println("Age is between 1 and 100");
        }
    }
}

public class Prog03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age:");
        int n = sc.nextInt();
        try {
            ExceptionDemo.validateAge(n);
        } catch (AgeValidationException e) {
            System.out.println("Exception has occurred: " + e);
        }
        System.out.println("Rest of the code");
    }
}
