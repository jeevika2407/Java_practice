package com.collections;

import java.util.*;

public class ArrayDequeDemo {
public static void main(String args[]) {
	ArrayDeque <String> a=new ArrayDeque <String>();
	System.out.println("size of arraydeque: "+a.size());
	
	a.push("k");
	a.push("b");
	a.push("i");
	a.push("o");
	a.push("s");

	a.addFirst("a");
	
	a.addLast("y");
	
	Iterator i= a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next()+" ");
	}
	
	System.out.println("element in arrayqueue: "+a);
	System.out.println("element in arrayqueue: "+a.size());

	Iterator<String> it = a.descendingIterator();
    while (it.hasNext()) {
        System.out.print(it.next() + " ");
    }
    
 
} 
}
