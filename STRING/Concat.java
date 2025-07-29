package com.string;

public class Concat {
public static void main(String args[]) {
	String str="Always"+"Smile";
	String str1=1+2+3+"All"+"is"+"good"+20+20; //after string literal it is taken as string literal
	String str2="all".concat(str1);
	String str3=str.concat(str1);
	System.out.println(str);
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	}
}
