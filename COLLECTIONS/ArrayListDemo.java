package com.collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();

        System.out.println("Initial size of array: " + arr.size());

        arr.add("c");
        arr.add("a");
        arr.add("s");
        arr.add(1, "g");
        
        arr.remove("a");
        arr.remove(0);
        

        Iterator<String> itArr = arr.iterator();

        System.out.println("After insert size of array: " + arr.size());

//        arr.remove("a");
//        arr.remove(0);
//        

        System.out.println("Final ArrayList: " + arr);
        
           while (itArr.hasNext()) { 
//            String n = itArr.next(); 
            System.out.println(itArr.next());      
        }
    }
        
        
}
