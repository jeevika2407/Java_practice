package CondiPractice;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		if(num<=0) {
			System.out.println("invalid input");
		}
		else {
			long fact=1;
			int i=1;
			boolean isFact=false;
			
			while(fact <= num) {
				if(fact==num) {
					isFact=true;
					break;
				}
				i++;
				fact *=i;
				
			}
			if(isFact) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}
}
