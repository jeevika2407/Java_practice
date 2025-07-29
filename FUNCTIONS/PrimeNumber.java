package FunctionPractice;
import java.util.*;
public class PrimeNumber {
	public static void calculatePrime(int x,int y) {
		for(int i=x;i<y;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
	    calculatePrime(x,y);
		sc.close();
	}
}
