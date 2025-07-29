package com.oopsassignment;

class Crop {
    private char vegetableType;
    private int quantity;

    public Crop(char vegetableType, int quantity) {
        this.vegetableType = vegetableType;
        this.quantity = quantity;
    }

    public void printDetails() {
        System.out.println(vegetableType + " " + quantity);
    }
}

public class Easy_5 {
    public static void main(String[] args) {
        Crop carrot = new Crop('C', 15);
        Crop potato = new Crop('P', 25);
        Crop brinjal = new Crop('B', 30);
        
        carrot.printDetails();
        potato.printDetails();
        brinjal.printDetails();
    }
}