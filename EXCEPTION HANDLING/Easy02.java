package com.exception;

import java.util.*;

class InvalidDivisionException extends Exception{
	public InvalidDivisionException(String message) {
		super(message);
	}
}

public class Easy02 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	try {
		System.out.println("enter numerator");
		int num=sc.nextInt();
		
		System.out.println("enter denominator");
		int den=sc.nextInt();
		
		if(den==0) {
			throw new InvalidDivisionException("error in division");
		}
		
		int res=num/den;
		System.out.println("result: "+res);
		
	}
	catch(InvalidDivisionException e){
		System.out.println("exception occured "+e.getMessage());
	}
	catch(Exception e) {
		System.out.println("Invalid input");
	}

}
}
