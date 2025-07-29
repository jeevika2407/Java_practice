package com.oops;

public class ThisExample {
	int empID;
	String empName;
	ThisExample(String empName,int empID){
		this.empName=empName;
		this.empID=empID;
	}
	void display() {
		System.out.println(empName+" "+empID);
	}
	public static void main(String args[]) {
		ThisExample obj=new ThisExample("jeev",1);
		obj.display();
	}
}
