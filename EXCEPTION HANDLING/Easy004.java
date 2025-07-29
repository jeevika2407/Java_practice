package com.exception;

import java.util.Scanner;

class CovidPositiveException extends Exception {
    public CovidPositiveException(String message) {
        super(message);
    }
}

class Patient {
    private String name;
    private int age;
    private double oxyLevel;
    private double hrctReport;

    public Patient(String name, int age, double oxyLevel, double hrctReport) throws CovidPositiveException {
        if (oxyLevel < 95 && hrctReport > 10) {
            throw new CovidPositiveException("Patient is Covid Positive(+) and Needs to be Hospitalized.");
        }
        this.name = name;
        this.age = age;
        this.oxyLevel = oxyLevel;
        this.hrctReport = hrctReport;
    }

    public void displayDetails() {
        System.out.println("\nPatient Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Oxygen Level: " + oxyLevel);
        System.out.println("HRCT Report: " + hrctReport);
    }
}

public class Easy004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = sc.nextInt();

            System.out.print("Enter oxygen level: ");
            double oxyLevel = sc.nextDouble();

            System.out.print("Enter HRCT report: ");
            double hrctReport = sc.nextDouble();

            Patient patient = new Patient(name, age, oxyLevel, hrctReport);
            patient.displayDetails();
        } catch (CovidPositiveException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid details.");
        } finally {
            sc.close();
        }
    }
}
