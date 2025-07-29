package ArrayPractice;
import java.util.*;
public class BlackNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] numbers = new int[100];
        int count = 0;
        
        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            numbers[count++] = num;
        }

        for (int i = 0; i < count; i++) {
            int num = numbers[i];
            if (num % 7 == 0 && num % 8 == 0) {
                numbers[i] = -6;
            } else if (num % 7 == 0) {
                numbers[i] = -2;
            } else if (num % 8 == 0) {
                numbers[i] = -9;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
        
	}
}
