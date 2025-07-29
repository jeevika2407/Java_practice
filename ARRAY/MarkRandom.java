package ArrayPractice;
import java.util.*;
public class MarkRandom {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int key=sc.nextInt();
		int count=0;
		int arr[]=new int[25];
		
		for(int i=0;i<25;i++) {
		arr[i]=random.nextInt(100)+1;
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<25;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		System.out.println("key is found "+count);
		sc.close();
		}
	}


