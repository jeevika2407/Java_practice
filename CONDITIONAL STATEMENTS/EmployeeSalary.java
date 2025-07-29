package CondiPractice;
import java.util.*;
class EmployeeSalary {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter employee name: ");
	        String name = sc.next();
	        System.out.print("Enter wages per day: ");
	        double wages = sc.nextDouble();
	        System.out.print("Enter number of days worked: ");
	        int days = sc.nextInt();
	        double totalSalary = wages * days;
	        System.out.println("Total Salary: " + totalSalary);
	    }
}
