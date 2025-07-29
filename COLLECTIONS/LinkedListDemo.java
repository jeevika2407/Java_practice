package com.collections;
import java.util.*;
public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String>arr=new LinkedList<String>();
		System.out.println("inital size of linked list: "+arr.size());
		arr.add("dharu");
		arr.add("gayu");
		arr.add("jeevu");
		arr.addFirst("a");
		arr.addFirst("a");
		arr.remove("a");
		arr.removeFirst();
		System.out.println("size of linked list: "+arr.size());
		System.out.println(arr);
		
		
	}
}
