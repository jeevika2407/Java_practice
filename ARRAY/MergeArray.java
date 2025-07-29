package ArrayPractice;
import java.util.*;
public class MergeArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[size];
		for(int i=0;i<size;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int arr3[]=new int[(size+size)];
		
		for(int i=0;i<size;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=size;i<size+size;i++) {
			arr3[i]=arr2[i-size];
		}
		for(int i=0;i<size+size;i++) {
		System.out.print(arr3[i]+" ");
		}
		sc.close();
	}
}
