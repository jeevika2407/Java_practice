package CondiPractice;
import java.util.*;
public class Page {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1-typing 2-copy");
		int job=sc.nextInt();
		System.out.println("Enter number of paper required");
		int paper=sc.nextInt();
		
		if(job==1) {
			System.out.println("Rate of typing: "+paper*3);
		}
		else {
			if(paper==1) {
				System.out.println("Rate of copying: 1");
			}
			else {
				System.out.println("Rate of copying: "+(1+(paper-1)*3));
			}
		}
		sc.close();
	}
}
