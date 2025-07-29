package com.stringpractice;
import java.util.*;
public class Hard1 {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String s = "HELLO";
	        int key = 2;
	        System.out.println("enter the choice: 1-sender 2-receiver");
	        int choice = sc.nextInt();
	        String res = "";

	        if (choice == 1) {
	            for (char c : s.toCharArray()) {
	                if (c >= 'A' && c <= 'Z') {
	                    char shiftedChar = (char) ((c - 'A' + key) % 26 + 'A');
	                    res += shiftedChar;
	                } else {
	                    res += c;
	                }
	            }
	            System.out.println("Encrypted text: " + res);
	        } 
	        else if (choice == 2) {
	            for (char c : s.toCharArray()) {
	                if (c >= 'A' && c <= 'Z') {
	                    char shiftedChar = (char) ((c - 'A' - key + 26) % 26 + 'A');
	                    res += shiftedChar;
	                } else {
	                    res += c;
	                }
	            }
	            System.out.println("Decrypted text: " + res);
	        }
	    }
	}
