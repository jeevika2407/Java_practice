package com.oops;

class Base{
	Base(){
		System.out.println("Inside base constructor");
	}
}
class Derived1 extends Base{
	Derived1(){
		System.out.println("Inside derived1 constructor");
	}
}
class Derived2 extends Derived1{
	Derived2(){
		System.out.println("Inside derived2 constructor");
	}
}
 class InheritancewithConstructor {
	public static void main(String args[]) {
		
		Derived2 obj=new Derived2();
	}
}
