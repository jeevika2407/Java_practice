/*The final grade of a student in a course is calculated as 30% of the exercise’s grade and 
as 70% of the exam’s grade, only if both grades are greater than or equal to 5; 
otherwise, the final grade will be their minimum. Write a program that reads 
continuously pairs of grades (exercises and exam grades) and displays the final grade 
for each student, until the user enters a pair of grades containing the value −1. Before it 
ends, the program should display the average grade of all students in the course. The 
program should check that all given grades belong in [0,10]. */


package CondiPractice;
import java.util.*;
public class Grade {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double totalGrade=0;
		int count=0;
		while(true) {
			double excercise=sc.nextDouble();
			double exam=sc.nextDouble();
			if(excercise==-1 && exam==-1) {
				break;
			}
			if(excercise<0 || excercise>10 || exam<0 || exam>10) {
				System.out.println("enter between 0 to 10");
				continue;
			}
			double total;
			if(excercise >= 5 && exam >=5) {
				total=excercise*0.30 + exam*0.70;
			}
			else {
				total=Math.min(exam, excercise);
			}
			totalGrade += total;
			count++;
			System.out.println(total);
		}
		if(count > 0) {
			double average=totalGrade/count;
			System.out.println("Average of all the students"+average);
		}
		sc.close();
	}
}
