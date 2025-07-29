package com.exception;

public class Finally {
	public static void main(String args[]) {
		try {
			int data=25/0;
			System.out.println(data);
		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally excecuted");
		}
		System.out.println("rest of the code");
	}
	
	
}
