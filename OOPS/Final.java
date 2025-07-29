package com.oops;

class Sample {
    final double pi = 3.14159; // Initialized directly, cannot be changed

    public Sample() {
       
    }
}

public class Final {
    public static void main(String args[]) {
        Sample obj = new Sample();
        System.out.println(obj.pi);
    }
}
