package CondiPractice;
import java.util.*;
public class Discount {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double amt=sc.nextDouble();
		if(amt>500) {
			System.out.println("You have a discount of 15% total expenxe is "+(amt-(amt*0.15)));
			sc.close();
		}
	}
}
