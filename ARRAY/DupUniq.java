package ArrayPractice;

public class DupUniq {
	public static void main(String args[]) {
		int size=5;
		int count=0;
		int a[]=new int[128];
		int arr[]= {1,2,3,3,4};
		for(int i=0;i<arr.length;i++) {
			a[arr[i]]++;
			
		}
		if(a[arr[i]]==0) {
			count++;
			System.out.println("No of unique elements: "+count);
		}
		else {
			System.out.println("No of duplicate elements: "+count);
		}
		}
	}
