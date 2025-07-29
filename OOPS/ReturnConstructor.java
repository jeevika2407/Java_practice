package com.oops;

class Example {
    Example() {
        System.out.println("Constructor started");
        if (true) return; // Allowed (exits early)
        System.out.println("This won't print");
    }
}

public class ReturnConstructor {
    public static void main(String[] args) {
        Example e = new Example(); // Calls the constructor
    }
}
