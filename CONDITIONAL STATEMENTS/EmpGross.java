package CondiPractice;
import java.util.*;
public class EmpGross {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		double hra;
		double da;
		if(sal<=10000) {
			hra=0.20*sal;
			da=0.80*sal;
		}
		else if(sal>10001 && sal<20000) {
			hra=0.25*sal;
			da=0.90*sal;
		}
		else {
			hra=0.30*sal;
			da=0.95*sal;
		}
		double total=sal+hra+da;
		System.out.println(total);
	
		sc.close();
	}
}
