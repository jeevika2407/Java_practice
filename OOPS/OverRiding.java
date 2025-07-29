package com.oops;
class Vehicle{
	void run() {
		System.out.println("vehicle is running");
	}
}
class Truck extends Vehicle{
	void run() {
		System.out.println("truck is running");
	}
}
class OverRiding {
	public static void main(String args[]) {
		Vehicle obj=new Vehicle();
		obj.run();
		Vehicle obj1=new Truck();
		obj1.run();
	}
}
