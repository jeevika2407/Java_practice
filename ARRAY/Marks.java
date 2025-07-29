package ArrayPractice;
import java.util.*;
public class Marks {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  int arr[]=new int[25];
	  for(int i=0;i<25;i++) {
		  arr[i]=sc.nextInt();
	  }
	  int key=sc.nextInt();
	  int c=0;
	  for(int i=0;i<25;i++) {
		  if(arr[i]==key) {
			  c++;
		  }
	  }
	  if(c!=0) {
		  System.out.println(c);
	  }
	  else {
		  System.out.println("key not present");
	  }
	  sc.close();
  }
}
