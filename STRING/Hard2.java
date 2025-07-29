package com.stringpractice;

import java.util.*;

public class Hard2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        sc.close();

        int d = 0, l = 0, u = 0, lo = 0, s = 0;
        String specialChars = "!@#$%^&*()_+-";

        if (pass.length() >= 6) {
            l = 1;
        }

        for (int i = 0; i < pass.length(); i++) {
            char a = pass.charAt(i);
            if (Character.isDigit(a)) {
                d = 1;
            }
            if (Character.isLowerCase(a)) {
                lo = 1;
            }
            if (Character.isUpperCase(a)) {
                u = 1;
            }
            if (specialChars.contains(String.valueOf(a))) {
                s = 1;
            }
        }

        if (d == 1 && l == 1 && lo == 1 && u == 1 && s == 1) {
            System.out.println("Strong");
        } else if (l == 1 && d == 1 && lo == 1) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }
    }
}
