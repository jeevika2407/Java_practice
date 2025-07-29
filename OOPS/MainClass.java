package com.oops;

class Single {
    String name;
    int id;

    void setData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Second extends Single {
    String dept;

    void setDept(String dept) {
        this.dept = dept;
    }

    void displayDept() {
        System.out.println("Department: " + dept);
    }
}

public class MainClass {  
    public static void main(String args[]) {
        Second s = new Second();
        s.setData("Jeev", 1);
        s.setDept("CRM");
        s.displayData();
        s.displayDept();
    }
}
