package com.Practice;
import java.util.*;
public class Arrays {
	public static void main(String args[]) {
		    /*  int[] evens = new int[5];
		        int[] odds = new int[5];
		        int evenIndex = 0, oddIndex = 0;

		        for (int i = 1; i <= 10; i++) {
		            if (i % 2 == 0) {
		                evens[evenIndex++] = i;
		            } else {
		                odds[oddIndex++] = i;
		            }
		        }

		        System.out.println("Even numbers: ");
		        for (int even : evens) {
		            System.out.print(even + " ");
		        }

		        System.out.println("\nOdd numbers: ");
		        for (int odd : odds) {
		            System.out.print(odd + " ");
		        }
		        
		        
		        
		 int[] arr = {5, 3, 8, 1, 2, 7};
	        Arrays.sort(arr); 

	        System.out.println("Sorted Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        
	       
	        
	                int[] arr = {4, 7, 1, 9, 3, 6};
	                int max = arr[0];
	                int min = arr[0];

	                for (int i = 1; i < arr.length; i++) { 
	                    if (arr[i] > max) {
	                        max = arr[i];
	                    }
	                    if (arr[i] < min) {
	                        min = arr[i];
	                    }
	                }

	                System.out.println("Maximum value: " + max);
	                System.out.println("Minimum value: " + min);
	      */
	                
	                //medium
	                int[] arr= {1,2,5,4,8};
	                int key=5;
	                int c=0;
	                		
	                for(int i=0;i<arr.length;i++) {
	                	if(arr[i]==key) {
	                		c=1;
	                		break;
	                	}
	                }
	                	if(c==1) {
	                		System.out.println("true");
	                	}
	                	else {
	                		System.out.println("false");
	                	}
	                
	                	
	                


	}
}
