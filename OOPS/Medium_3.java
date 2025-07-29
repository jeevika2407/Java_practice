package com.oopsassignment;
import java.util.*;
class Singer {
    private String name;
    private String email;
    private char gender;
    
    public Singer(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public char getGender() {
        return gender;
    }
}

class MusicAlbum {
    private String name;
    private Singer singer;
    private double price;
    private int qtyInStock;
    
    public MusicAlbum(String name, Singer singer, double price, int qtyInStock) {
        this.name = name;
        this.singer = singer;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName() {
        return name;
    }
    
    public Singer getSinger() {
        return singer;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQtyInStock() {
        return qtyInStock;
    }
    
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class Medium_3 {
    public static void main(String[] args) {
        Singer singer = new Singer("AR", "ar@example.com", 'm');
        MusicAlbum album = new MusicAlbum("Greatest Hits", singer, 20.99, 60);
        
        System.out.println("Album Name: " + album.getName());
        System.out.println("Price: " + album.getPrice());
        System.out.println("Quantity in Stock: " + album.getQtyInStock());
        
        System.out.println("Singer Name: " + album.getSinger().getName());
        System.out.println("Singer Email: " + album.getSinger().getEmail());
        System.out.println("Singer Gender: " + album.getSinger().getGender());
    }
}
