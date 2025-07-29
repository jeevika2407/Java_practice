package com.collections;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> t = new TreeMap<>();

        System.out.println("Size of TreeMap: " + t.size());

        t.put("je", 10.3);
        t.put("dha", 7.7);
        t.put("ss", 2.6);
        t.put("k", 3.6);
        t.put("gg", 6.8);

      
        Iterator<String> i = t.keySet().iterator();
        System.out.println("Keys in TreeMap:");
        while (i.hasNext()) {
            String key = i.next();
            System.out.println(key);
        }

       
        Iterator<Double> valueIterator = t.values().iterator();
        System.out.println("\nValues in TreeMap:");
        while (valueIterator.hasNext()) {
            Double value = valueIterator.next();
            System.out.println(value);
        }

        List<String> list = new ArrayList<>(t.keySet());
        ListIterator<String> l = list.listIterator();

        while (l.hasNext()) {
            String element = l.next();
            l.set(element);
        }

        System.out.println("\nModified list contents using ListIterator:");
        for (String mod : list) {
            System.out.println(mod);
        }
        
        while(l.hasPrevious()) {
        	String element=l.previous();
        	System.out.println(element+" ");
        }
    }
}
