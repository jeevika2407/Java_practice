package com.exception;

class InvalidProductException extends Exception{
	public InvalidProductException(String s) {
		super(s);
	}
}
public class ExceptionDemo{
	void productCheck(int weight)throws InvalidProductException{
		if(weight<100) {
			throw new InvalidProductException("product invalid");
		}
	}
}
public class UserDefinedExpception2 {
	public static void main(String args[]) {
		ExceptionDemo obj=new ExceptionDemo();
		try {
			obj.productCheck(60);
		}
		catch(InvalidProductException e) {
			System
		}
	}
}
