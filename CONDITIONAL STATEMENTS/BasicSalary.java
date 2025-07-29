package CondiPractice;
import java.util.*;
public class BasicSalary {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the basic salary of the employee: ");
	        double basicSalary = sc.nextDouble();
	        double HRA, DA, grossSalary;

	        if (basicSalary <= 10000) {
	            HRA = basicSalary * 0.20;
	            DA = basicSalary * 0.80;
	        } else if (basicSalary <= 20000) {
	            HRA = basicSalary * 0.25;
	            DA = basicSalary * 0.90;
	        } else {
	            HRA = basicSalary * 0.30;
	            DA = basicSalary * 0.95;
	        }
	        grossSalary = basicSalary + HRA + DA;
	        System.out.println("Gross Salary: " + grossSalary);
	        sc.close();
	    }
}
