package com.cdac.main;

import java.util.Arrays;



/*6) .Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest)
*/
public class Program {
	

	private static void maxMinElement(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		int secL=arr[0];
		int thirdL =arr[0];
		int fourthL =arr[0];
		
		 for (int element : arr) {
		        if (element > max) {
		            thirdL = secL;
		            secL = max;
		            max = element;
		        } else if (element > secL && element != max) {
		            thirdL = secL;
		            secL = element;
		        } else if (element > thirdL && element != max && element != secL) {
		            fourthL = thirdL;
		        	thirdL = element;
		        }
		        
		        else if(element>fourthL && element!=max && element!=secL && element!=thirdL)
		        {
		        	fourthL = element;
		        }
		        if (element < min) {
		            min = element;
		        }
		    }
		
		System.out.print("Max is :"+max+"\n Min is :"+min+"\n Second Largest is :"+secL+"\n Third Largest is :"+thirdL+"\nFortu :"+fourthL);
	}
	
	private static void printArray(int[] arr) {
		System.out.println("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{24,54,31,16,82,45,67};
		
		printArray(ar);
		maxMinElement(ar);
		
	}


	
}
