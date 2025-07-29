package oops.practice;
import java.util.*;

class Tollbooth {
 private int totalVehicles;
 private double totalCash;

 public Tollbooth() {
     totalVehicles = 0;
     totalCash = 0.0;
 }

 public void payingVehicle() {
     totalVehicles++;
     totalCash += 0.50;
 }
 
 public void nopayVehicle() {
     totalVehicles++;
 }

 public void display() {
     System.out.println("Total Vehicles: " + totalVehicles);
     System.out.println("Total Cash: ₹" + totalCash);
 }
}

public class Toll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tollbooth tollbooth = new Tollbooth();
        
        while (true) {
          
            System.out.println("\nEnter choice:");
            System.out.println("1 - Paying Veh");
            System.out.println("2 - Non paying Veh");
            System.out.println("3 - total");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();

            if (choice == 1) {
                tollbooth.payingVehicle();
                System.out.println("Paying vehicle");
            } else if (choice == 2) {
                tollbooth.nopayVehicle();
                System.out.println("Non-paying vehicle");
            } else if (choice == 3) {
                tollbooth.display();
                break; 
            } else {
                System.out.println("invalid");
            }
        }
        sc.close();
    }
}

