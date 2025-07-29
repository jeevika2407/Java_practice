package com.db;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.util.Scanner;
	public class Oracle_insert {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter roll: ");
			int roll=sc.nextInt();
			System.out.println("Enter name: ");
			String name=sc.next();
			System.out.println("Enter Gender: ");
			String gender=sc.next();
			System.out.println("Enter age: ");
			int age=sc.nextInt();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Oracle_Demo","jeevika");
				PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
				ps.setInt(1, roll);
				ps.setString(2, name);
				ps.setString(3, gender);
				ps.setInt(4, age);
				int z=ps.executeUpdate();
				if(z>0) {
					System.out.println("record saved successfully");
				}else {
					System.out.println("record not saved");
				}
				con.close();
			}catch(Exception e){
			                                              
			}
	   }
}
