package FunctionPractice;

public class BloodDonar {
 public static void donateBlood(int age, int wt) {
	if(age>18 && wt<55) {
		System.out.println("eligible to donate blood");
	}
	else {
		System.out.println("not eligible to donate blood");
	}
}
 public static void main(String args[]) {
	 donateBlood(19,56);
 }
 
}
