package com.collections;
import java.util.*;
public class Col02 {
	    public static void main(String[] args) {
	      
	        Set<String> s = new LinkedHashSet<>(); 
	        s.add("Java");
	        s.add("Hello");
	        s.add("Programming");
	        s.add("World");

	        String concatenatedResult = "";
	        Iterator<String> iterator = s.iterator();

	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println("Elements in the Set : " + element);
	            concatenatedResult += element + " "; 
	        }

	        System.out.println("Concatenated result: " + concatenatedResult.trim());
	    }
	}
