package com.collections;
import java.util.*;

public class Col04 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Mano", 85);
        studentMarks.put("Shan", 85);
        studentMarks.put("John", 55);
        studentMarks.put("Anu", 60);
        studentMarks.put("Aju", 90);
        studentMarks.put("Frank", 80);

        System.out.println("Student Marks in the HashMap: " + studentMarks);
        
        Stack<String> stack = new Stack<>();

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > 75) {
                stack.push(entry.getKey());
            }
        }

        System.out.println("Student Marks above 75 in the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
