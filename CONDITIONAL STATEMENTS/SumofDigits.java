package CondiPractice;
import java.util.*;
public class SumofDigits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the N value: ");
	        int N = sc.nextInt();
	        for (int i = 1; i <= N; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	   }
}