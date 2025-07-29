package CondiPractice;
import java.util.*;
public class InternetBrowsing {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter browsing time in hours: ");
	        int hours = sc.nextInt();
	        System.out.print("Enter additional minutes: ");
	        int minutes = sc.nextInt();
	        
	        if (hours > 7 || (hours == 7 && minutes > 0)) {
	            System.out.println("Maximum browsing limit is 7 hours.");
	            return;
	        }

	        int totalBill = 0;
	        if (hours >= 5) {
	            totalBill = 200;
	            hours -= 5;
	        }
	        totalBill += hours * 50 + minutes;

	        System.out.println("Total Bill: Rs. " + totalBill);
	    }
	}
