package oops.practice;

import java.util.Scanner;

class Tollbooth {
    private int totalVehicles = 0;
    private double totalRevenue = 0.0;
    private final double tollFee = 50.0; // Example toll fee per paying vehicle

    // Method for paying vehicles
    public void payingVehicle() {
        totalVehicles++;
        totalRevenue += tollFee; // Increment revenue
    }

    // Method for non-paying vehicles
    public void nonPayingVehicle() {
        totalVehicles++;
    }

    // Display tollbooth statistics
    public void displayTollData() {
        System.out.println("Total Vehicles Passed: " + totalVehicles);
        System.out.println("Total Revenue Collected: ₹" + totalRevenue);
    }
}

public class Vehicle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Tollbooth booth = new Tollbooth();

        while (true) {
            System.out.println("Enter vehicle type: 1 - Paying, 2 - Non-Paying, 3 - Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    booth.payingVehicle();
                    System.out.println("Paying vehicle passed.");
                    break;
                case 2:
                    booth.nonPayingVehicle();
                    System.out.println("Non-paying vehicle passed.");
                    break;
                case 3:
                    System.out.println("Final Toll Data:");
                    booth.displayTollData();
                    sc.close();
                    return; // Exit program
                default:
                    System.out.println("Invalid input! Try again.");
            }
        }
    }
}
