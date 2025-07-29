package com.string;

public class PlsWait {
	public static void main(String args[]) {
		String s="All is Well";
		String arr[]=s.split(" ");
		for(int i=0;i<2;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("let..wait");
		
		for(int i=2;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
