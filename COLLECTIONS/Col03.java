package com.collections;
import java.util.*;
public class Col03 {

	public static void main(String[] args) {
		String text = "Write Java code to define yet another Set s. Insert 3 floating \r\n"
				+ "point numbers in s, and using an iterator, find the sum of the numbers in s.";
		
		char targetChar[]= {'a','c','s','o'};
		
		HashMap<Character, Integer> charCount =new HashMap<>();
		for(char ch: targetChar) {
			charCount.put(ch,0);
		}
		for(char ch:text.toCharArray()) {
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}
		}
		System.out.println("character count:");
		for(char ch:targetChar) {
			System.out.println(ch+": "+charCount.get(ch));
		}
	}

}


