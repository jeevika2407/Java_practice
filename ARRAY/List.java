package ArrayPractice;
import java.util.*;
public class List {
	public static void main(String args[]) {
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int n=arr.length;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=-1) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}
}
