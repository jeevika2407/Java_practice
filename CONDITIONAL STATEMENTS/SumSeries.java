package CondiPractice;
import java.util.*;
public class SumSeries {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of i: ");
	        int i = sc.nextInt(), sum = 0, num = 1;
	        do {
	            sum += num;
	            num++;
	        } while (num <= i);
	        System.out.println("Sum: " + sum);
	    }
	}