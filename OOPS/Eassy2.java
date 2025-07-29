package com.oopsassignment;

class Triangle {
    private double side1 = 3;
    private double side2 = 4;
    private double side3 = 5;
    
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

public class Eassy2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        
        System.out.println("Perimeter of Triangle: " + triangle.getPerimeter());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
