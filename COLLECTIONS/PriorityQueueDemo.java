package com.collections;
import java.util.*;
public class PriorityQueueDemo {
public static void main(String args[]) {
	PriorityQueue <String> p=new PriorityQueue<String>();
	System.out.println("size of prioty queue: "+p.size());
	
	p.offer("a");
	p.offer("b");
	p.offer("h");
	p.offer("y");
	p.offer("o");
	
	System.out.println("poll: "+p.poll());
	System.out.println("element: "+p.element());
	System.out.println("peek: "+p.peek());
	
	System.out.println("elements in the priority queue: "+p);
}
}
