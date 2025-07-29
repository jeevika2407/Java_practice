package CondiPractice;
import java.util.*;
public class Browse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in hrs");
		int hrs=sc.nextInt();
		if(hrs>7) {
			if(hrs<5)
			System.out.println("Amount to be paid is 50 Rs");
			else if(hrs>=5) {
				System.out.println("Amount to be paid is 200 Rs");
			}
		}
		sc.close();
	}
}
