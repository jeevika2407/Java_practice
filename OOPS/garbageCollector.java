package com.oops;

public class garbageCollector {
	
	public static void main(String args[]) {
		garbageCollector obj =new garbageCollector();
		obj.finalize();
		System.gc();
		System.out.println("Inside the main() method");
	}
	@Override()
	protected void finalize() {
		System.out.println("object is destroyed garbage collector");
	}
	
}
