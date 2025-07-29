package CondiPractice;
import java.util.*;
public class ClothShowroom {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double total=sc.nextDouble();
		double discount=0;
		
		if(total<2000) {
			discount=0;
		}
		else if(total >= 2000 && total < 5000) {
			discount=0.05;
		}
		else if(total >= 5000 && total <10000) {
			discount=0.25;
		}
		else if(total >= 10000){
			discount=0.35;
		}
		
		double discountAmount=total*discount;
		double amountTotal=total-discountAmount;
		
		System.out.println("amount to be paid: "+amountTotal);
		sc.close();
	}
}
