package CondiPractice;
import java.util.*;
public class CountLetter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String inp=sc.nextLine();
		int letter=0;
		int digit=0;
		int other=0;
		for(int i=0;i<inp.length();i++) {
			char ch=inp.charAt(i);
			if(Character.isLetter(ch)) {
				letter++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				other++;
			}
		}
		System.out.println("Letter: "+letter+" Digits: "+digit+" Others: "+other);
		sc.close();
	}
}
