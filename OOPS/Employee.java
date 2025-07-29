package com.oops;

public class Employee {
	String employeeId;
	String employeeName;
	
	public void setemployeeDetails(String id,String name) {
		employeeId=id;
		employeeName=name;
	}
	public void getemployeeDetails() {
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
	
	public static void main(String args[]) {
		Employee emp[]=new Employee[2];
		for(int i=0;i<2;i++) {
			emp[i]=new Employee();
		}
		emp[0].setemployeeDetails("1", "abi");
		emp[1].setemployeeDetails("2", "rahul");
		
		emp[0].getemployeeDetails();
		emp[1].getemployeeDetails();
	}
}
