package com.oops;

public class ParameterizedConstructor {
	int empId;
	String empName;
	
	 ParameterizedConstructor(int id, String name) {
		empId=id;
		empName=name;
	}
	void getEmployeeDetails() {
		System.out.println("Employee id :"+empId);
		System.out.println("Employee Name :"+empName);
	}
	public static void main(String args[]) {
		ParameterizedConstructor obj=new ParameterizedConstructor(1,"jeev");
		obj.getEmployeeDetails();
	}
}
