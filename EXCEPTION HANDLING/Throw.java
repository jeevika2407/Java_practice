package com.exception;

public class Throw {
	
static void validate(int num) {
	if(num<0) 
		throw new ArithmeticException("Invalid Value");
	else
		System.out.println("valid to proceed");
}
public static void main(String args[]) {
	try {
		validate(-10);
	}
	catch(Exception e) {
		System.out.println("Error: "+e);
	}
	System.out.println("rest of the code");
}
	
	/*static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }
    }
    */
}
