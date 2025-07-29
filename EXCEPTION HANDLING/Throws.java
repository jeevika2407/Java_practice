package com.exception;
import java.io.IOException;
class Throw{
    
    void myMethod(int num)throws IOException{
    	if(num==1) {
    		throw new IOException("IOExeception Occured");
    	}
    	else
    		throw new ClassNotFoundException("ClassNotFoundException");
    }
    public class Throws{
    	public static void main(String args[]) {
    		try {
    			ThrowExample obj=new ThrowExample();
    			obj.myMethod();
    		}
    		catch(Exception e) {
    			System.out.println(e);
    		}
    	}
    }
}


/*	static void fun() throws IllegalAccessException
{
    System.out.println("Inside fun(). ");
    throw new IllegalAccessException("demo");
}

public static void main(String args[])
{
    try {
        fun();
    }
    catch (IllegalAccessException e) {
        System.out.println("Caught in main.");
//        System.out.println(e.getMessage());
    }
}

*/ 

