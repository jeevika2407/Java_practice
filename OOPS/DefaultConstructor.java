package com.oops;

public class DefaultConstructor {
	int empId;
	String empName;
	
	void getEmployee() {
		System.out.println(empId);
		System.out.println(empName);
	}
	public static void main(String args[]) {
		DefaultConstructor def=new DefaultConstructor();
		def.getEmployee();
	}

}
class EmployeeMain{
		int empId;
		String empName;
		
		void getEmployee() {
			System.out.println(empId);
			System.out.println(empName);
		}
		public static void main(String args[]) {
			DefaultConstructor def=new DefaultConstructor();
			def.getEmployee();
		}

	}
