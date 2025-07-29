package com.stringpractice;

import java.util.Scanner;

public class Med4 {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.nextLine();
			int c=0;
			for(int i=0;i<s.length()-1;i++) {
				if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') && (s.charAt(i+1)=='a'|| s.charAt(i+1)=='e'|| s.charAt(i+1)=='i'||s.charAt(i+1)=='o'||s.charAt(i+1)=='u')){
					c++;
				}
			}
			System.out.println("the count of occurence of successive vowels :"+c);
			
		}
	}