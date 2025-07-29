package com.oops;

public class ObjectCreation {
	String threatreID;
	String threatreName="Inox";
	public void getThreatre() {
		System.out.println("ThreatreID:"+threatreID);
		System.out.println("ThreatreName:"+threatreName);
	}
	public static void main(String args[]) {
		ObjectCreation obj=new ObjectCreation();
		obj.threatreID="1234";
		obj.getThreatre();
	}
}
