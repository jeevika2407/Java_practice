package com.collections;
import java.util.*;
public class Col01 {
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of names you want to store");
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String name=sc.nextLine();
			arr.add(name);
		}
		System.out.println("Names longer than 5 Characters");
		for(String s:arr) {
			if(s.length()>5) {
				System.out.println(s);
			}
		}
		}
	}
