package com.collections;
import java.util.*;
public class HashSetDemo {
public static void main(String args[]) {
	HashSet <String>h=new HashSet<String>();
	h.add("apple");
	h.add("banana");
	h.add("grapes");
	h.add("banana");
	h.add("cherry");
	
	System.out.println("elements in hashSet:"+h);
	System.out.println("elements in hashSet:"+h.size());
	
	
}
}

/* 
package com.collections;
import java.util.*;
public class HashSetDemo {
public static void main(String args[]) {
	LinkedHashSet <String>h=new LinkedHashSet<String>();
	h.add("apple");
	h.add("banana");
	h.add("grapes");
	h.add("banana");
	h.add("cherry");
	
	System.out.println("elements in hashSet:"+h);
	System.out.println("elements in hashSet:"+h.size());
}
}
*/