package com.exception;
import java.io.FileOutputStream;
public class FileOutputt {
public static void main(String args[]) {
	String data="Welcome to Java Portal!!!Have a Happy Learning";
	try {
		FileOutputStream output = new FileOutputStream("D:\\output.txt");
		byte array[]=data.getBytes();
		output.write(array);
		output.close();
		
		}
	catch(Exception e){
		System.out.println(e);
	}
}
}
