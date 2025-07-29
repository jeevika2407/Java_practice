package com.oops;

public class ConstructorOverloading {
	String theatreId;
	String theatreName;
	
	ConstructorOverloading(){
		theatreId="1";
		theatreName="jeev";
	}
	ConstructorOverloading(String id, String name){
		theatreId=id;
		theatreName=name;
	}
	public void details() {
		System.out.println("theatreId "+theatreId);
		System.out.println("theatreName "+theatreName);
	}
	public static void main(String args[]) {
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading();
		obj1.details();
		obj2.details();
	}
}
