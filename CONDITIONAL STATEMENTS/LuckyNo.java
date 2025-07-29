/*Ana planned to choose the four digit lucky number for her car. Her lucky numbers are 3, 
5 and 7. Help her to find the number, whose sum is divisible by 3 or 5 or 7. Provide a 
valid car number, Fails to provide a valid input then display that number is not a valid 
car number. 
Sample Input 1: 
Enter the car no: 1234 
Sample Output 1: 
Lucky Number */

package CondiPractice;
import java.util.*;
public class LuckyNo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car no: ");
		int carNum=sc.nextInt();
		int sum=0;
		int c=1;
		while(carNum>0) {
			int a=carNum%10;
			c++;
			sum += a;
			carNum=carNum/10;
		}
		
		if(c>4 && sum%3==0 || sum%5==0 || sum%7==0) {
			System.out.println("Lucky Number");
		}
		
		else {
			System.out.println("Sorry it's not my lucky number");
		}
	
		sc.close();
	}
}
