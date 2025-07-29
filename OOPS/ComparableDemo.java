package com.Comparable;
import java.util.*;
import java.lang.*;
class Mobile implements Comparable <Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name, int ram, int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	String getName() {
		return name;
	}
	void setName() {
	   this.name=name;
	}
	 int getRam() {
		return ram;
	}
	 void setRam(int ram) {
		this.ram = ram;
	}
	 int getPrice() {
		return price;
	}
    void setPrice(int price) {
		this.price = price;
	}
    public int compareTo(Mobile o) {
    	if(this.ram > o.getRam()) {
    		return 1;
    	}
    	else
    		return -1;
    }
	
}
public class ComparableDemo {

	public static void main(String[] args) {
	List<Mobile>mobileList=new ArrayList<>();
	mobileList.add(new Mobile("redme",16,800));
	mobileList.add(new Mobile("apple",18,10000));
	mobileList.add(new Mobile("samsung",13,100));
	
	Collections.sort(mobileList);
	System.out.println("mobile after sorting:");
	System.out.println("name"+"\t"+"Ram"+"\t"+"Price");
	for(Mobile mb:mobileList) {
		System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
	}
	}

}
