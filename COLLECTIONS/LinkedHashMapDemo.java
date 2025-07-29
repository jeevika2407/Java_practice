package com.collections;

import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> h = new LinkedHashMap<>();

        System.out.println("Size of LinkedHashMap: " + h.size());

        h.put("jeev", 1.2);
        h.put("dharu", 2.5);  //comes in the same order i give the input
        h.put("gayu", 1.9);
        h.put("anu", 2.2);

        System.out.println("LinkedHashMap: " + h);
        System.out.println("Size of LinkedHashMap: " + h.size());

        System.out.println("Contains key 'jeev': " + h.containsKey("jeev"));
        System.out.println("Contains value 2.5: " + h.containsValue(2.5));

        h.replace("dharu", 0.7);
        System.out.println("After replacing 'dharu': " + h);

        System.out.println("Value of 'dharu': " + h.get("dharu"));

        h.remove("gayu");
        System.out.println("After removing 'gayu': " + h);
    }
}
