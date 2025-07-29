package com.collections;
import java.util.*;
public class StackDemo {
public static void main(String args[]) {
	Stack <String> s=new Stack <String>();
	System.out.println("size of stack: "+s.size());
	s.push("a");
	s.push("b");
	s.push("c");
	
	System.out.println("elements in the stack: "+s);
	s.pop();
	System.out.println("elements in the stack: "+s);
//	s.peek();
	System.out.println("elements in the stack: "+s.peek());
}
}