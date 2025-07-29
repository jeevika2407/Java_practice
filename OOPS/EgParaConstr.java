package com.oops;

public class EgParaConstr {
	String theatreId;
	String theatreName;
	
	EgParaConstr(String id, String name) {
		theatreId=id;
		theatreName=name;
	}
	void getEmployeeDetails() {
		System.out.println("Employee id :"+theatreId);
		System.out.println("Employee Name :"+theatreName);
	}
	public static void main(String args[]) {
		EgParaConstr obj=new EgParaConstr("1","jeev");
		obj.getEmployeeDetails();
	}
}
