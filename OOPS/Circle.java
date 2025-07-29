package oops.practice;

public class Circle {
    private double radius;
    private String color;

    // Default Constructor
    public Circle() {
        this.radius = 1.0; // Default radius
        this.color = "White"; // Default color
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "White"; // Default color
    }

    // Constructor with radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Setter for radius
    public void setRadius(double radius) {  // Changed int to double
        this.radius = radius;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Method to calculate and return area
    public double getArea() {  
        return Math.PI * radius * radius; // Used Math.PI for better accuracy
    }

    // Method to display circle details
    public void display() {
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Color of the circle: " + color);
        System.out.println("Area of the circle: " + getArea()); // Calling getArea()
    }

    // Main method to test the class
    public static void main(String args[]) {
        Circle c = new Circle();
        c.setRadius(5.0);
        c.setColor("Red");
        c.display();

        // Testing parameterized constructor
        Circle c2 = new Circle(7.5, "Blue");
        c2.display();
    }
}
