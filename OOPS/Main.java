package com.oops;

class Person {
    private String name;
    protected String address;
    private String email;
    private String gender;

    // Getter methods for private variables
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    protected void viewPerson() {
        System.out.println("Name: " + getName()); // Using getter
        System.out.println("Address: " + address); // Directly accessible (protected)
        System.out.println("Email: " + getEmail()); // Using getter
        System.out.println("Gender: " + getGender()); // Using getter
    }

    public void setPersonDetails(String name, String address, String email, String gender) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }
}

class Admin extends Person {
    private String userType;

    Admin() {
        this.userType = "admin";
    }

    public void getUserType() {
        System.out.println("User type: " + userType);
    }
}

public class Main {
    public static void main(String args[]) {
        Admin a = new Admin();
        a.setPersonDetails("Admin", "123 Main St", "admin@mail.com", "Male");
        a.getUserType();
        a.viewPerson();
    }
}
