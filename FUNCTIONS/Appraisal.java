package FunctionPractice;
import java.util.*;
public class Appraisal {
	public static double calculate(double salary, double rate) {
		if(salary<=0 || rate<1 || rate>10) {
			return -1;
		}
		double inc;
		if(rate >=1 && rate <=4) {
			inc=0.10;
		}
		else if(rate>4 && rate<=7) {
			inc=0.25;
		}
		else {
			inc=0.30;
		}
		return salary+(salary*inc);
	}
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double salary=sc.nextDouble();
	double rate=sc.nextDouble();
	
	double increment=calculate(salary,rate);
	if(increment == -1) {
        System.out.println("Invalid Input");
    } else {
        System.out.println("Incremented Salary: " + increment);
    }
    sc.close();
  }
}
