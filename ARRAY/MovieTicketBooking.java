package com.expleo;

import java.util.Scanner;
import java.lang.*;

public class MovieTicketBooking {
	public static void main(String args[]) {
		
//	System.out.println("seat types are: regular premium executive");
	Scanner sc=new Scanner(System.in);
//	int movieId=sc.nextInt();
//	String movName=sc.next();
//	String movDesp=sc.next();
//	String lang=sc.next();
//	String genre=sc.next();
//	String date=sc.next();
//	
//	System.out.println("enter movie id :"+movieId);
//	System.out.println("enter movie name :"+movName);
//	System.out.println("enter movie description :"+movDesp);
//	System.out.println("enter movie language :"+lang);
//	System.out.println("enter the movie genre :"+genre);
//	System.out.println("enter the date :"+date);
	
	
//	boolean seatAvailable=true;
//	int seatNumb=sc.nextInt();
//	int n=sc.nextInt();
//	if (seatAvailable) {
//		System.out.println(seatNumb+" booked");
//	}
//	else {
//		System.out.println("not booked");
//	}
	
	
//	int color= sc.nextInt();
//	if(color==1) {
//		System.out.println("red");
//	}
//	else if(color==2) {
//		System.out.println("blue");
//	}
//	else {
//		System.out.println("green");
//	}
	
//	String seatType=sc.next();
//	System.out.println("seat types are: regular premium executive");
//	if(seatType.equals("executive")) {
//		System.out.println("cost is 80");
//	}
//	else if(seatType.equals("regular")) {
//		System.out.println("cost is 20");
//	}
//	else if(seatType.equals("premium")) {
//		System.out.println("cost is 10");
//	}
//	else {
//		System.out.println("seat not available");
//	}
	
	
	/*String userName1="Hari";
	String userName=sc.next();
	String pwd=sc.next();
	boolean seatAvailable=true;
	if(userName1.equals(userName)) {
		if(seatAvailable) {
			System.out.println("seat available");
		}
		else {
			System.out.println("seat not available");
		}
	}
	else {
		System.out.println("not eligible");
	}
	
	
	int letter ='B';
	switch(letter) {
	case 'b':
		System.out.println("lowercase");
		break;
	case 'B':
		System.out.println("uppercase");
		break;
	default:
		System.out.println("not alphabet");
	}
	
	
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("search by name");
		break;
		
	case 2:
		System.out.println("search by keyword");
		break;
		
	case 3:
		System.out.println("search by genre");
		break;
		
	case 4:
		System.out.println("search by title");
		break;
		
	default:
		System.out.println("no search");
	}
	
	
	int maxSeat=10;
	int seatCount=0;
	while(seatCount<maxSeat) {
		System.out.println("seat availablity: "+(maxSeat-seatCount));
		seatCount++;
	}
	System.out.println("not available");
	
	
	
	int maxSeat=10;
	int seatCount=0;
	do {
		System.out.println("seat availablity: "+(maxSeat-seatCount));
		seatCount++;
		
	}
	while(seatCount<maxSeat); 
	System.out.println("not available");
	
	
	int maxSeat=10;
	int seatCount=0;
	for(seatCount=0;seatCount<maxSeat;seatCount++) {
		System.out.println("seat availablity: "+(maxSeat-seatCount));
	}
	System.out.println("not available"); 
	
	int[] arr = { 1, 2, 3, 4, 5 };

    for (int i : arr) {
        System.out.print(i + " ");
    }
    
    
	
    int[] marks= {125,132,86,95};
    int max=marks[0];
    for(int i: marks) {
    	if(i>max) {
    		max=i;
    	}
    }
    	System.out.println(max); 
    	
    	
    String[] movName= {"aaa","bbb"};
    String[] movGenre= {"action","comedy"};
    String genre=sc.next();
    int i=0;
    for(String M : movGenre) {
    	if(M.equals(genre)) {
        System.out.println(movName[i]);
    	}
    	i++;
    }
    
	
	
	int seatCount=0;
	int maxSeatCount=5;
	int screenCount=0;
	int maxScreenCount=2;
	
	while(screenCount < maxScreenCount) {
		seatCount=0;
		System.out.println("Screen "+(screenCount+1));
		while(seatCount<maxSeatCount) {
			System.out.println("Current seat availabilty: "+(maxSeatCount-seatCount));
			seatCount++;
		}
		screenCount++;
	}
  
	

	int maxSeatCount=5;
	int screenCount=0;
	int maxScreenCount=2;
	do {
		int seatCount=0;
		do {
			System.out.println("Current seat availabilty: "+(maxSeatCount-seatCount));
			seatCount++;
		}
		while(seatCount<maxSeatCount);
        System.out.println("screen availablity "+(seatCount+1));
		screenCount++;
	}
	while(screenCount < maxScreenCount);
	
	
	
	int premium=5;
	int vip=5;
	int seatBooked=0;
	int total=premium+vip;
	for(seatBooked=0;seatBooked<total;seatBooked++) {
		if(seatBooked>premium) {
			System.out.println("all premium are booked");
			System.out.println("vip seats from 1 to 5");
			break;
		}
		else {
			System.out.println("premium seat availablity "+(premium-seatBooked));
			}
			
	
	
	int executive=5;
	int vip=5;
	int premium=5;
	int seatBooked=0;
	int total=executive+vip+premium;
	for(seatBooked=0;seatBooked<total;seatBooked++) {
		if(seatBooked<(vip)) {
		System.out.println("all vip seats from 1 to 5 are booked ");
		continue;
		}
		else if(seatBooked<vip+premium) {
	System.out.println("premium seats "+(seatBooked+1));
		}
		else if(seatBooked<(vip+premium+executive)) {
	System.out.println("executive seats "+(seatBooked+1));
		}
		}
		
	
	
	int maxseatCount=10;
	int totalscreencount=2;
	int seatCount=0;
	int screenCount=-1;
	
	start:
		while(screenCount<totalscreencount) {
			screenCount++;
			System.out.println("screen "+(screenCount+1)+" seat booked details");
			while(seatCount < maxseatCount) {
				if(seatCount >= 3 && seatCount==1) {
					System.out.println("seat no 4 and 5 are reserved");
					break start;
				}
				else {
					System.out.println("seat no booked: "+(seatCount+1));
					seatCount++;
				}
				System.out.println("all seats are filled in screen "+(screenCount+1));
				
			}
		}
	
	
	int index=0;
	int result=1;
	while(true) {
		index++;
		if(index % 2==0) {
			continue;
		}
		else if(index%5==0) {
			break;
		}
		System.out.println(result *= 3);
	}
	
	
	
	
	for(int i=0; ;i++) {
		System.out.println("hii");
	}
	System.out.println("bye");
	
	
	
	*/
	
	
	
		}
  }


