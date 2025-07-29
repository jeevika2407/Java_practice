package com.collections;
import java.util.*;
public class Col05 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TreeSet<Integer> numbers = new TreeSet<>();
	        int sum = 0, count = 0;

	        while (true) {
	            System.out.print("Enter a number (or type 'done' to finish): ");
	            String input = sc.nextLine();

	            if (input.equalsIgnoreCase("done")) {
	                break;
	            }

	            int num = Integer.parseInt(input);
	            if (numbers.add(num)) {
	                sum += num;
	                count++;
	            }
	        }

	        if (!numbers.isEmpty()) {
	            System.out.println("Sorted unique numbers: " + numbers);
	            System.out.println("Average: " + ((double) sum / count));
	            System.out.println("Lowest: " + numbers.first());
	            System.out.println("Highest: " + numbers.last());

	            List<Integer> oddNumbers = new ArrayList<>();
	            for (int num : numbers) {
	                if (num % 2 != 0) {
	                    oddNumbers.add(num);
	                }
	            }
	            System.out.println("Odd numbers: " + oddNumbers);
	        } else {
	            System.out.println("No numbers entered.");
	        }
	    }
	}
