package ArrayPractice;
import java.util.*;
public class DiceFrequency {
	public static void main(String args[]) {
		int frequency[]=new int[6];
		Random random=new Random();
		for(int i=0;i<100;i++) {
			int roll=random.nextInt(6)+1;
			frequency[roll-1]++;
		}
		System.out.println("Frequency of numbers rolled:");
		   for (int i = 0; i < frequency.length; i++) {
		       System.out.println((i + 1) + ": " + frequency[i]);
	}
   }
}