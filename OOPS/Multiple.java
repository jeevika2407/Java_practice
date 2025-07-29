package com.oops;

 class ProjectLeader {
	String progleadname="jeev";
	int projid=1000;
 }
	class Programmer extends ProjectLeader{
		String progname;
		int empid;
		void setData(String name, int id) {
			progname=name;
			empid=id;
		}
	void displayData() {
		System.out.println("Programmer Name "+progname);
		System.out.println("Programmer id "+projid);
		System.out.println("Proj leader name "+super.progleadname);
		System.out.println("Proj leader id "+super.projid);
	}
	}
	public class Multiple{
		public static void main(String args[]) {
			Programmer p=new Programmer();
			p.setData("jeev", 111);
			p.displayData();
	   }
	}
		
  

