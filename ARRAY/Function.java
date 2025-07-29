package com.expleo;

public class Function {
	public static int add(int a, int b) {  //function body  , parameters
		return a+b;
	}
	public static void main(String args[]) {
		int sum;
		sum=add(1,2);                     //calling function , arguments
		System.out.println("sum is "+sum);
	}
}
