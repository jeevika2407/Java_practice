package com.Practice;
import java.util.*;
import java.lang.*;
public class ControlStatements {
	public static void main(String args[]) {
		        Scanner sc = new Scanner(System.in);
		        
		/*        String name = sc.nextLine();
		       
		        double wage = sc.nextDouble();
		      
		        int days = sc.nextInt();

		        double totalSalary = wage * days;
		        System.out.println(totalSalary);	
		        
		 
		        
		        int number = sc.nextInt();

		        if (number % 7 == 0) {
		            System.out.println(number + " is a divisor of 7.");
		        } else {
		            System.out.println(number + " is not a divisor of 7.");
		        }
		        
		        
		        char ch = sc.next().charAt(0);

		        if (Character.isLetter(ch)) {
		            ch = Character.toLowerCase(ch);
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                System.out.println(ch + " is a vowel.");
		            } else {
		                System.out.println(ch + " is a consonant.");
		            }
		        } else {
		            System.out.println(ch + " is a symbol.");
		        }
		        
		        
		        char ch = sc.next().charAt(0);

		        switch (Character.toLowerCase(ch)) {
		            case 'a': 
		            case 'e':
		            case 'i':
		            case 'o':
		            case 'u':
		            System.out.println(ch + " is a vowel.");
		            break;
		            case 'b': case 'c': case 'd': case 'f': case 'g': case 'h':
		            case 'j': case 'k': case 'l': case 'm': case 'n': case 'p':
		            case 'q': case 'r': case 's': case 't': case 'v': case 'w':
		            case 'x': case 'y': case 'z':
		                System.out.println(ch + " is a consonant.");
		                break;
		            default:
		                System.out.println(ch + " is a symbol.");
		        }
		        
		        
		        int i = sc.nextInt();
		        int sum = 0, current = 1;

		        do {
		            sum += current;
		            current++;
		        } while (current <= i);

		        System.out.println(sum);
		        
		        
		        */
		        char start = 'a';
		        char end = 'z';

		        for (int i = 0; i < 13; i++) {
		            System.out.println((char) (start + i) + "" + (char) (end - i));
		        }
	}
}
