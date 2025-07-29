package FunctionPractice;
import java.util.*;
public class OddEven {
	public static int calculateOdd(int lb, int ub) {
		int sum=0;
		for(int i=lb;i<ub;i++) {
			if(i%2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static int calculateEven(int lb, int ub) {
		int sum=0;
		for(int i=lb;i<ub;i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int lb=sc.nextInt();
		int ub=sc.nextInt();
		int sumodd=calculateOdd(lb,ub);
		int evensum=calculateEven(lb,ub);
		System.out.println("The sum of odd number from "+lb+" to "+ub+" is : "+sumodd);
		System.out.println("The sum of even number from "+lb+" to "+ub+" is : "+evensum);
		int absolute=sumodd-evensum;
		System.out.println("The absolute difference between the two sums is: "+absolute);
		sc.close();
	}
}
