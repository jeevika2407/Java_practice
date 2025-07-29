package com.stringpractice;

import java.util.*;

public class Med3 {
    public static void main(String[] args) {
        String[] names = {"Ashok", "Alok", "Akash", "Amit", "Amol", "Anil", "Ashish", "Anand"};

        Arrays.sort(names, (a, b) -> a.substring(0, 3).compareTo(b.substring(0, 3)));

        System.out.println("Sorted Names:");
        for (String x : names) {
            System.out.println(x);
        }
    }
}

