package com.oops;

import java.util.Scanner;

enum PaymentStatus {
    UNPAID, COMPLETED;
}

abstract class Pay {
    protected static double amount;
    protected static int transactionId;
    protected static String createdOn;
    protected static PaymentStatus status;

    Pay(int transid, String date) {
        transactionId = transid;
        amount = 0.0;
        createdOn = date;
        status = PaymentStatus.UNPAID;
    }

    public abstract void pay(double amt);
}

class Card extends Pay {
    private int cardNumber;

    Card(int transid, String date) {
        super(transid, date);
    }

    @Override
    public void pay(double amt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card no:");
        cardNumber = sc.nextInt();
        amount = amt;
        System.out.println("Thank you for the payment.");
        status = PaymentStatus.COMPLETED;
    }
    public void getCardDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Created on: " + createdOn);
        System.out.println("Payment Status: " + status);
        System.out.println("Card Number: " + cardNumber);
    }
}

class Cash extends Pay {
    private double cashAmount;

    Cash(int transid, String date) {
        super(transid, date);
    }

    @Override
    public void pay(double amt) {
        amount = amt;
        cashAmount = amt;
        System.out.println("Thank you for making a cash payment.");
        status = PaymentStatus.COMPLETED;
    }

    public void getCashDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Created on: " + createdOn);
        System.out.println("Payment Status: " + status);
        System.out.println("Cash Amount: " + cashAmount);
    }
}

public class Payment {
    public static void main(String args[]) {
        Card card = new Card(1234, "03/04/2022");
        card.pay(120.0);
        card.getCardDetails();

        Cash cash = new Cash(5678, "04/04/2022");
        cash.pay(430.0);
        cash.getCashDetails();
    }
}
