package com.exception;
public class ArrayIndex {
	public static void main(String args[]) {
		try {
			int a[]=new int[2];
			System.out.println("access element three: "+a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception thrown: "+e);
			System.out.println(e.getMessage());
//			System.out.println(e.printStackTrace());
			e.printStackTrace();
			
		}
		System.out.println("get message");                                                                                                                                 
	}
}