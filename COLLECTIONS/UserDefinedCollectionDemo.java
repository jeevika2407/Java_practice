package com.collections;

import java.util.LinkedList;

class Address{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String n, String s, String c, String st, String cd){
		name=n;
		street=s;
		city=c;
		state=st;
		code=cd;
	}
	public String toString() {
		return name+" "+street+" "+city+" "+state+" "+code;
	}
}
public class UserDefinedCollectionDemo {

	public static void main(String[] args) {
		LinkedList<Address>l=new LinkedList<Address>();
		l.add(new Address("jeev","11 oak","slm","IL","1111"));
		l.add(new Address("dha","12 oak","slm","IL","1111"));
		l.add(new Address("gay","13 oak","slm","IL","1111"));
		
		for(Address element:l) {
			System.out.println(element);
		}
	}

}
