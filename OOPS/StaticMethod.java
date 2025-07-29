package com.oops;

public class StaticMethod {
		int empId;
		String empName;
		static String compName="Abc Solutions";
		
		StaticMethod(int id,String name){
			empId=id;
			empName=name;
		}
		void display(){
			System.out.println("company name "+compName);
			System.out.println("Emp Id "+empId);
			System.out.println("Emp Name "+empName);
		}
		static void getCompany() {
			 compName="Xyz Solutions";
		}
		public static void main(String args[]) {
			StaticMethod obj1=new StaticMethod(1001,"ram");
			StaticMethod obj2=new StaticMethod(1002,"jeev");
			obj1.display();
			obj2.display();
			StaticMethod.getCompany();
			obj1.display();
			obj2.display();
		}
}
