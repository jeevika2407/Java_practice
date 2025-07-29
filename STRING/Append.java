package com.StringBuilder;

public class Append {

	public static void main(String[] args) {
	/*	StringBuilder s=new StringBuilder("Hello");
		StringBuffer s1=new StringBuffer("Hello");
		s1.append(" World");
		System.out.println(s1);
	}
	
	
	StringBuilder s=new StringBuilder("I want a job");
	StringBuffer s1=new StringBuffer("I want a job");
	s1.insert(2,"really ");
	System.out.println(s1);
	
	}
	
		
	StringBuilder s1=new StringBuilder("success");
	StringBuffer s2=new StringBuffer("success"); //start replacing from 2nd index and go upto 4 but not 4 and 4th index is printed
	s1.replace(2,4,"xxxx");
	System.out.println(s1);
	}
	
	*/
		StringBuilder s=new StringBuilder("Hello");
		StringBuffer s1=new StringBuffer("Hello");
		System.out.println(s.capacity());
		s1.append("Java");
		System.out.println(s1.capacity());
	}
}
