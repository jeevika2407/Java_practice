package com.exception;

import java.util.*;
//import java.lang.*;
class NoMatchException extends Exception {
    NoMatchException(String s) {
        super(s);
    }
}

class ExceptionDemoo {
    static void validate(String country) throws NoMatchException {
        if (!(country.equals("India"))) {
            throw new NoMatchException("Country name is not India");
        } else {
            System.out.println("Country name is India");
        }
    }
}

public class Easy01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Aadhar No:");
        int aadharNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the city:");
        String city = sc.nextLine();

        System.out.println("Enter the state:");
        String state = sc.nextLine();

        System.out.println("Enter the country:");
        String country = sc.nextLine();

        try {
            ExceptionDemoo.validate(country);
        } catch (NoMatchException m) {
            System.out.println("Exception occurred: " + m);
        }

        System.out.println("Rest of the code");
    }
}
