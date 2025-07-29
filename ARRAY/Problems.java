package com.expleo;

public class Problems {
	public static void main(String args[]) {
		int n=9474;
		
		int num=String.valueOf(n).length();
		
		
		int temp=n;
		int two=0;
		while(temp>0) {
			int l=temp%10;
			int one=1;
			for(int i=1;i<=num;i++) {
			one*=l;
			}
			two += one;
//			System.out.println(two);
			temp=temp/10;
		}
		
		if(n==two) {
		System.out.println("armstrong");
		}
		else {
		System.out.println("not an armstrong");
		}
	}
}

