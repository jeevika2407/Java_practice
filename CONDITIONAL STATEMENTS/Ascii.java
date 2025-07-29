/*Numbers and Alphabets has equivalent ASCII values i.e Numbers (0 to 9) equivalent 
ASCII value is 48 to 57, uppercase alphabet (A to Z) equivalent ASCII value is 65 to 90 
and lowercase alphabet (a to z) equivalent ASCII value is 97 to 120. Write a program to 
sort numbers 0 to 9, alphabets in upper and lowercase using equivalent ASCII values. */

package CondiPractice;
import java.util.*;

public class Ascii {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter alp or num");
	        String input = sc.nextLine();

	        char[] arr = input.toCharArray(); 

	        Arrays.sort(arr); 

	        System.out.println("Sorted Order using ASCII values:");
	        System.out.println(new String(arr)+" ");
	        
	        sc.close();
	    }
	}
