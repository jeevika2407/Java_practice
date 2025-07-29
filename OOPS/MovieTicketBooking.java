package com.oops;

public class MovieTicketBooking {
    public static void main(String[] args) {	
        Admin1 admin = new Admin1();
        admin.getUsertype();
        admin.detail("Admin", "Salem", 12345, "admin@gmail.com", "Female");
        admin.setUserDetails(101, "dhara");
        admin.displayUserDetails();
        admin.view();
    }
}

class Person1 {
    private String name;
    private String address;
    private int mobile;
    private String email;
    private String gender;

    protected void detail(String uname, String uaddress, int umobile, String uemail, String ugender) {
        name = uname;
        address = uaddress;
        mobile = umobile;
        email = uemail;
        gender = ugender;
    }

    protected void view() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}

class User extends Person1 {
    private int userid;
    private String password;

    public void setUserDetails(int euserid, String epassword) {
        userid = euserid;
        password = epassword;
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + userid);
    }
}

class Admin1 extends User {
    private String usertype;

    Admin1() {
        usertype = "Administrator";
    }

    public void getUsertype() {
        System.out.println("User Type: " + usertype);
    }
}
