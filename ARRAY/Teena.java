package ArrayPractice;
import java.util.*;
public class Teena {
	public static void main(String args[]) {
		int arr[]= {10,10,10,10,20,20,20,20,40,40,50,50,30 };
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int count =1;
			if(arr[i]!=-1) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			System.out.println(arr[i]+" "+count);
		   }
		}
		
	}
}
