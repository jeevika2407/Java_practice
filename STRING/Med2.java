package com.stringpractice;

public class Med2 {
	    public static void main(String args[]) {
	        String s1 = "Sachin";
	        String s2 = "Tendulkar";

	        String firstName = "";
	        for (int i = 0; i < 3; i++) {
	            firstName += s1.charAt(i);
	        }

	        String lastName = "";
	        for (int i = s2.length() - 3; i < s2.length(); i++) {
	            lastName += s2.charAt(i);
	        }

	        int totalLength = s1.length() + s2.length();

	        System.out.println("Password: " + firstName + lastName + totalLength);
	    }
	}


