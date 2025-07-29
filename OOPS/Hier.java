package com.oops;

// Base class
class Person {
    private String name;
    protected String address;
    private String email;
    private String gender;

    protected void viewPerson() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }

    public void setPersonDetails(String name, String address, String email, String gender) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }
}

// Derived class 1
class User extends Person {
    private int userId;
    private String userPassword;

    public void setUserDetails(int userId, String password) {
        this.userId = userId;
        this.userPassword = password;
    }

    public void displayDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Password: " + userPassword);
    }
}

// Derived class 2
class Admin extends Person {
    private String userType;

    Admin() {
        this.userType = "admin";
    }

    public void getUserType() {
        System.out.println("User Type: " + userType);
    }
}

// Derived class 3
class Office extends Person {
    private String officeType;

    Office() {
        this.officeType = "office";
    }

    public void getOfficeType() {
        System.out.println("Office Type: " + officeType);
    }
}

// Main class
public class Hier {
    public static void main(String args[]) {
        // Creating an instance of Admin
        Admin admin = new Admin();
        admin.setPersonDetails("Admin", "123 Main St", "admin@mail.com", "Male");
        admin.getUserType();
        admin.viewPerson();

        System.out.println("-------------------------");

        // Creating an instance of Office
        Office office = new Office();
        office.setPersonDetails("Office Manager", "456 Office Rd", "office@mail.com", "Female");
        office.getOfficeType();
        office.viewPerson();
    }
}
