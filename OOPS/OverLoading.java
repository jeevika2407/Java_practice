package com.oops;
public class OverLoading {
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
	public static void main(String args[]) {
		System.out.println("output int: "+OverLoading.add(1,2));
		System.out.println("output double: "+OverLoading.add(1.3,2.6));
		System.out.println("output double: "+(int)OverLoading.add(1.3,2.6));
  }
}


