package com.oops;

public class Static {
 static int empId;
 static String empName;
 
 static {
	 System.out.println("Static Block 1");
	 empId=1001;
	 empName="alex";
 }
 static {
	 System.out.println("Static Block 2");
	 empId=1002;
	 empName="jeev";
 }
 public static void main(String args[]) {
	 System.out.println("Employee Id: "+empId);
	 System.out.println("Employee Id: "+empName);
 }
}
