package com.oopsassignment;
import java.util.*;
class Flight {
    private int flightNumber;
    private String destination;
    private float distance;
    private float fuel;
    
    private void CALFUEL() {
        if (distance <= 1000) {
            fuel = 500;
        } else if (distance > 1000 && distance <= 2000) {
            fuel = 1100;
        } else {
            fuel = 2200;
        }
    }
    
    public void FEEDINFO() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Flight Number: ");
        flightNumber = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Destination: ");
        destination = sc.nextLine();
        
        System.out.print("Enter Distance: ");
        distance = sc.nextFloat();
        
        CALFUEL();
        
    }
    
    public void SHOWINFO() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance);
        System.out.println("Fuel Required: " + fuel);
    }
}

public class Medium_4 {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.FEEDINFO();
        flight.SHOWINFO();
    }
}

