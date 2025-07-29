package com.oopsassignment;

class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
}

public class Easy_3 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);
        
        System.out.println("Area of Rectangle 1: " + rect1.getArea());
        System.out.println("Area of Rectangle 2: " + rect2.getArea());
    }
}