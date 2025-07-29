package CondiPractice;
import java.util.*;
public class PrintHello {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int count, total = 0;
	        while (true) {
	            System.out.print("Enter a number: ");
	            count = sc.nextInt();
	            if (count < 0) break;
	            for (int i = 0; i < count; i++) {
	                System.out.println("Hello");
	                total++;
	            }
	        }
	    }
	}

