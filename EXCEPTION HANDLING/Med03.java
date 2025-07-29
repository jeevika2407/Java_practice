package com.exception;

import java.time.*;
import java.time.Period;
import java.util.Scanner;

class InvalidEmpNumberException extends Exception {
    public InvalidEmpNumberException(String message) {
        super(message);
    }
}

class InvalidDateOfJoinException extends Exception {
    public InvalidDateOfJoinException(String message) {
        super(message);
    }
}

class Employee {
    private int empCode;
    private String name;
    private LocalDate dob;
    private LocalDate doj;

    public Employee(int empCode, String name, LocalDate dob, LocalDate doj) throws InvalidEmpNumberException, InvalidDateOfJoinException {
        if (empCode <= 0) {
            throw new InvalidEmpNumberException("Employee code must be a positive integer.");
        }
        if (dob.isAfter(doj)) {
            throw new InvalidDateOfJoinException("Date of birth must be before the date of appointment.");
        }
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Date of Appointment: " + doj);
        System.out.println("Years of Experience: " + Period.between(doj, LocalDate.now()).getYears());
    }
}

public class Med03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Employee Code: ");
            int empCode = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            System.out.print("Enter Date of Appointment (YYYY-MM-DD): ");
            LocalDate doj = LocalDate.parse(sc.nextLine());

            Employee emp = new Employee(empCode, name, dob, doj);
            emp.displayEmployeeDetails();
        } catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter data in the correct format.");
        } 
        }
    }
