package com.string;

public class Equals {
	public static void main(String args[]) {
		String s1="Computer";
		String s2="Computer";
//		if(s1.equals(s2)) {
			if(s1==s2) { //both belong to same reference and string pool
			System.out.println("String are equal");
		}
		else {
			System.out.println("String are not equal");
		}
	}
}
 