package com.oopsassignment;
import java.util.*;
class Average {
    public void calculateAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }
}

public class Easy_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Average avg = new Average();
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        
        avg.calculateAverage(num1, num2, num3);
        
        
    }
}