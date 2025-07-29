package com.oops;

public class Example1 {
    static int theatreCount = 0;       
    String theatreID;
    String theatreName;
    Example1(String tid,String name){
      	         theatreID = tid;
                 theatreName = name;
                 theatreCount++;
    }
    public void DisplayTheatre() {
                  System.out.println("Theatre ID :  "+theatreID);
                  System.out.println("Theatre Name : "+theatreName);
	              System.out.println("Total Number of theatres: "+theatreCount);
    }   
    public static void main(String args[]) {
    	System.out.println("Theatre Detail");
    	Example1 T1 = new Example1("T5432","SPICINEMAS");
    	Example1 T2 = new Example1("T2346","INOX");
	T2.DisplayTheatre();
      }
}
