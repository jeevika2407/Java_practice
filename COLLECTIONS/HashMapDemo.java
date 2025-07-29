package com.collections;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<String, Double> h = new HashMap<>();
        System.out.println("Size of hashmap: " + h.size());

     
        h.put("jeev", 1.2);
        h.put("dharu", 2.5);
        h.put("gayu", 1.9);
        h.put("anu", 2.2);

        System.out.println("HashMap: " + h);
        System.out.println("Size of hashmap: " + h.size());

        Set<Map.Entry<String, Double>> set = h.entrySet();
        System.out.println("HashMap entries: " + set);

      
        System.out.println("Contains key: " + h.containsKey("jeev"));
        System.out.println("Contains value: " + h.containsValue(2.5));
        
        h.replace("dharu", 0.7);
        System.out.println("After replacing 'dharu': " + h);

        h.get("dharu");
        
        System.out.println( h.get("dharu"));
        h.remove("gayu");
        
        System.out.println("After removing 'gayu': " + h);
    }
}
