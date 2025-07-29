package com.stringpractice;

public class Easy1 {
	public static void main(String args[]) {
		String s="INDIA";
		String encrypted="";
		for(char c: s.toCharArray()) {
			encrypted += (char)(c+2);
		}
		System.out.println("Encrypted text: "+encrypted);
		
		String decrypted="";
		for(char c: encrypted.toCharArray()){
			decrypted += (char)(c-2);
		}
		System.out.println("Decrypted text: "+decrypted);
	}
}
