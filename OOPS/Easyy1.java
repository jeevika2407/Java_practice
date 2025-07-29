package com.oopsassignment;

import java.util.*;

class Area {
    private double length;
    private double breadth;
    
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
}

public class Easyy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rectangle = new Area();
        
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        
        rectangle.setDim(length, breadth);
        
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        
        
    }
}

