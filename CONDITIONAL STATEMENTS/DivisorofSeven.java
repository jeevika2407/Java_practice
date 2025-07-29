package CondiPractice;
import java.util.*;
	public class DivisorofSeven {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        if (num % 7 == 0) {
	            System.out.println(num + " is a divisor of 7");
	        }
	    }
}
