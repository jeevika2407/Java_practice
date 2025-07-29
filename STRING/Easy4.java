package com.stringpractice;
import java.util.*;
public class Easy4 {
	public static void main(String args[]) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the string in uppercase:");
		        String s = sc.nextLine();

		        int[] frequency = new int[26];
		        for (char c : s.toCharArray()) {
		            if (c >= 'A' && c <= 'Z') { 
		                frequency[c - 'A']++; 
		            }
		        }

		        System.out.println("Character occurrences:");
		        for (int i = 0; i < 26; i++) {
		            if (frequency[i] > 0) { 
		                System.out.println((char) (i + 'A') + " : " + frequency[i]);
		          }
		      }

		}
}