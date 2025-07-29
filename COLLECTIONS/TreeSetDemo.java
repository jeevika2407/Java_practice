package com.collections;
import java.util.*;
public class TreeSetDemo {
	public static void main(String args[]) {
		
		TreeSet <String> t=new TreeSet<String>();
		
		System.out.println("size of the treeset: "+t.size());
		
		t.add("a");
		t.add("b");
		t.add("i");
		t.add("u");
		t.add("o");
		
		System.out.println("Higher: " + t.higher("i"));  
	    System.out.println("Lower: " + t.lower("b")); 
	        
		System.out.println("Poll First: " + t.pollFirst()); 
        System.out.println("Poll Last: " + t.pollLast());
         
		System.out.println("elements in treeset: "+t);

	}
}

