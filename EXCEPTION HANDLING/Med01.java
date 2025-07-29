package com.exception;

import java.util.*;

class BookLibrary {
    public static int BookId(int n, int p) throws IllegalArgumentException {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new IllegalArgumentException("n and p should not be zero.");
        }
        return n * 1000 + p; 
    }
}

public class Med01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter call number:");
        int n = sc.nextInt();

        System.out.println("Enter ID:");
        int p = sc.nextInt();

        sc.close();

        try {
            int bookId = BookLibrary.BookId(n, p);
            System.out.println("Book ID: " + bookId);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
