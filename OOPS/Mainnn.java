package com.oops;

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

class User extends Person {
    private int userId;
    private String userPassword;
    private boolean status;

    public void setUserDetails(int userId, String password) {
        this.userId = userId;
        this.userPassword = password;
    }

    public void displayDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Password: " + userPassword);
    }
}

class Admin extends Person {
    private String userType;

    Admin() {
        this.userType = "admin";
    }

    public void getUserType() {
        System.out.println("User Type: " + userType);
    }
}

public class Mainnn {
    public static void main(String args[]) {
        Admin admin = new Admin();
        admin.setPersonDetails("Admin", "123 Main St", "admin@mail.com", "Male");
        admin.getUserType();
        admin.viewPerson();
    }
}
