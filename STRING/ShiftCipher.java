package com.string;
import java.util.*;
public class ShiftCipher {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s="HELLO";
		int key=2;
		int choice=sc.nextInt();
		String res="";
		
		if(choice==1) {
			for(char c: s.toCharArray()) {
				if(c != 'z') {
				res += (char)(c+key);
			}
			else {
				res += (char)('a'+key-1);
			}
			}
			System.out.println(res);
			
		}
		
		else if(choice==2){
			for(char c: s.toCharArray()) {
				res += (char)(c-key);
			}
			System.out.println(res);
		}
	}
}

