package com.collections;
import java.util.*;
public class Prac1 {
	public static void main(String args[]) {
		ArrayList <Integer> a =new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

        System.out.println("After insert size of array: " + a.size());
        
		a.remove(4);

        System.out.println("After insert size of array: " + a.size());
        
		  Iterator <Integer> itArr = a.iterator();

	        System.out.println("Final ArrayList: " + a);
	        
	           while (itArr.hasNext()) { 

	            System.out.println(itArr.next());      
	        }
		
	}
}
