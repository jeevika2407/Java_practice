package CondiPractice;
import java.util.*;
public class PurchaseDiscount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter price per item: ");
	        double price = sc.nextDouble();
	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

	        double purAmt = price * quantity;
	        double discount = (purAmt > 1000) ? purAmt * 0.10 : purAmt * 0.05;
	        double finalAmt = purAmt - discount;

	        System.out.println("Total Purchase Amount: Rs. " + purAmt);
	        System.out.println("Discount Applied: Rs. " + discount);
	        System.out.println("Final Amount to be Paid: Rs. " + finalAmt);
	    }
	}
