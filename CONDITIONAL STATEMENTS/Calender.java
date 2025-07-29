package CondiPractice;
import java.util.*;
public class Calender {
		public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
			        System.out.println("Enter the month number");
			        int month=sc.nextInt();
			        System.out.println("Enter the starting day of the month");
			        int start=sc.nextInt();
			        int noofdays;
			        if (month == 2) {
			            System.out.print("Enter the number of days in February 28 or 29: ");
			           noofdays= sc.nextInt();
			        }
			        else {
			            int[] daysInMonths = { 0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			            noofdays = daysInMonths[month];
			        }
			        String[] Days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
			        System.out.println(" Calendar");
			        for (String a : Days) {
			            System.out.print(a + "\t");
			        }
			        System.out.println();
			        int c = 1;
			        for (int i = 1; i < start; i++) {
			            System.out.print("\t");
			        }
			        for (int i = start; c <= noofdays; i++) {
			            System.out.print(c + "\t");
			            if (i % 7 == 0) {
			                System.out.println();
			            }
			            c++;
			        }
			        System.out.println("\n");
			    }
			}