package com.stringpractice;

public class Easy2 {
    public static void main(String args[]) {
        String s = "abcd_5ef8!xyz";
        String alphabet = "";

        for (char c : s.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                alphabet += c;
            }
        }

        System.out.println("String with only alphabets: " + alphabet);
    }
}
