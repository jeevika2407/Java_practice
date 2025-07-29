package com.collections;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> t = new TreeMap<>();

        System.out.println("Size of TreeMap: " + t.size());

        t.put("je", 10.3);
        t.put("dha", 7.7);
        t.put("ss", 2.6);
        t.put("k", 3.6);
        t.put("gg", 6.8);

        System.out.println("Elements in TreeMap: " + t);
        System.out.println("Size of TreeMap: " + t.size());

        Set<Map.Entry<String, Double>> set = t.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() +" "+ me.getValue());
        }
    }
}
                                                                                                                      