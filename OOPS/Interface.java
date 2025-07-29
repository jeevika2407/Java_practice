package com.oops;
interface Vehicle11{
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}


class Bicycle implements Vehicle11 {
    int speed;
    int gear;

  
    public void changeGear(int newGear) {
        gear = newGear;
    }

  
    public void speedUp(int increment) {
        speed += increment;
    }

 
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printState() {
        System.out.println("Bicycle speed: " + speed + " Gear: " + gear);
    }
}

class Bike implements Vehicle11 {
     int speed;
    int gear;


    public void changeGear(int newGear) {
        gear = newGear;
    }

   
    public void speedUp(int increment) {
        speed += increment;
    }

   
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printState() {
        System.out.println("Bike speed: " + speed + " gear: " + gear);
    }
}


public class Interface {
    public static void main(String args[]) {
        Bicycle b = new Bicycle();
        Bike bike = new Bike();

        b.changeGear(2);
        b.speedUp(10);
        b.applyBrakes(3);
        b.printState();

        bike.changeGear(3);
        bike.speedUp(20);
        bike.applyBrakes(5);
        bike.printState();
    }
}
