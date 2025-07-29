package com.oopsassignment;
import java.util.*;
class Employee {
    private double salary;
    private int workHours;
    
    public void getInfo(double salary, int workHours) {
        this.salary = salary;
        this.workHours = workHours;
    }
    
    public void AddSal() {
        if (salary < 40000) {
            salary += 800;
        }
    }
    
    public void AddWork() {
        if (workHours > 6) {
            salary += 400;
        }
    }
    
    public void printSalary() {
        System.out.println("Final Salary: " + salary);
    }
}

public class Medium_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter work hours per day: ");
        int workHours = sc.nextInt();
        
        emp.getInfo(salary, workHours);
        emp.AddSal();
        emp.AddWork();
        emp.printSalary();
        
    }
}