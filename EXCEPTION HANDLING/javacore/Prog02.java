package com.javacore; 
import java.util.*;
public class Prog02 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		StringBuilder sb = new StringBuilder();
//		
//		if(sb.charAt(0)=='"') {
//			sb.append("@");
//		}
		if (word.length() >= 2) {
			sb.append(word.substring(0, 2));
		} else {
			sb.append(word);
			if (sb.length() < 2) {
				sb.append("@");
			}
		}
		
		System.out.println(sb);
		sc.close();
	}
//	sc.close();
}





