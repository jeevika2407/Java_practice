package com.oops;
public class StaticObject {
    int empId;
    String empName;
    static String compName = "Abc Solutions";

    StaticObject(int id, String name) {
        empId = id;
        empName = name;
    }

    void display() {
        System.out.println("Company Name: " + compName);
        System.out.println("Emp Id: " + empId);
        System.out.println("Emp Name: " + empName);
    }

    public static void main(String args[]) {
      
        StaticObject obj1 = new StaticObject(1, "Jeev");
        StaticObject obj2 = new StaticObject(2, "Saran");

        obj1.display();
        obj2.display();
    }
}
