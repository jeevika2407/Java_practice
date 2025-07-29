package com.stringpractice;

import java.util.*; 

public class Easy3 {
    public static void main(String args[]) {
        String arr[] = {"jeevi", "dharani", "gayu"};
        
        Arrays.sort(arr);
        
        System.out.println("After sorting the names:");
        for (String name : arr) {
            System.out.println(name);
        }
    }
}
