package com.oopsassignment;
import java.util.*;
class CashRegister {
    private int cashOnHand;
    
    public CashRegister() {
        this.cashOnHand = 100;
    }
    
    public CashRegister(int amount) {
        this.cashOnHand = amount;
    }
    
    public int getCurrentBalance() {
        return cashOnHand;
    }
    
    public void acceptAmount(int amount) {
        cashOnHand += amount;
    }
}

public class Medium_2 {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        
        System.out.println("Initial Balance: " + register.getCurrentBalance());
        
        register.acceptAmount(500);
        System.out.println("Balance after accepting amount: " + register.getCurrentBalance());
    }
}