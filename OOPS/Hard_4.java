package com.oopsassignment;
import java.util.*;

class RentalMachine {
    private HashMap<String, Boolean> machines;
    private HashMap<String, String> reservationDetails;
    private HashMap<String, String> returnDates;

    public RentalMachine() {
        machines = new HashMap<>();
        reservationDetails = new HashMap<>();
        returnDates = new HashMap<>();
        
        machines.put("Excavator", true);
        machines.put("Bulldozer", true);
        machines.put("Crane", true);
    }

    public void drawMachine(String machineName) {
        if (machines.containsKey(machineName) && machines.get(machineName)) {
            machines.put(machineName, false);
            System.out.println(machineName + " has been rented.");
        } else {
            System.out.println(machineName + " is not available.");
        }
    }

    public void returnMachine(String machineName, String returnDate) {
        if (machines.containsKey(machineName)) {
            machines.put(machineName, true);
            returnDates.put(machineName, returnDate);
            System.out.println(machineName + " has been returned on " + returnDate);
        } else {
            System.out.println("Invalid machine name.");
        }
    }

    public void checkStatus(String machineName) {
        if (returnDates.containsKey(machineName)) {
            System.out.println(machineName + " was last returned on: " + returnDates.get(machineName));
        } else {
            System.out.println("No return record for " + machineName);
        }
    }

    public void reserveMachine(String machineName, String userName) {
        if (machines.containsKey(machineName) && machines.get(machineName)) {
            reservationDetails.put(machineName, userName);
            System.out.println(machineName + " has been reserved for " + userName);
        } else {
            System.out.println(machineName + " is currently unavailable for reservation.");
        }
    }
}

public class Hard_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalMachine rental = new RentalMachine();
        char choice;
        
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Rent a machine");
            System.out.println("2. Return a machine");
            System.out.println("3. Check machine status");
            System.out.println("4. Reserve a machine");
            System.out.println("5. Exit");
            choice = sc.next().charAt(0);
            
            switch (choice) {
                case '1':
                    System.out.print("Enter machine name to rent: ");
                    String rentMachine = sc.next();
                    rental.drawMachine(rentMachine);
                    break;
                case '2':
                    System.out.print("Enter machine name to return: ");
                    String returnMachine = sc.next();
                    System.out.print("Enter return date (YYYY-MM-DD): ");
                    String returnDate = sc.next();
                    rental.returnMachine(returnMachine, returnDate);
                    break;
                case '3':
                    System.out.print("Enter machine name to check status: ");
                    String checkMachine = sc.next();
                    rental.checkStatus(checkMachine);
                    break;
                case '4':
                    System.out.print("Enter machine name to reserve: ");
                    String reserveMachine = sc.next();
                    System.out.print("Enter your name: ");
                    String userName = sc.next();
                    rental.reserveMachine(reserveMachine, userName);
                    break;
                case '5':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != '5');
        
    }
}

