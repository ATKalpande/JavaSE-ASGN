package com.cdac.main;

import java.util.Arrays;





//10) Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting
// Input: [5,14,35,90,139] Output: Ascending 
// Input: [88,67,35,14,-12] Output: Descending
//Input: [65,14,129,34,7] Output: Random 

public class Program {
	

	private static void orderArray(int[] arr) {
		int flag = 0;
		int glaf = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				flag++;
				
			}
			else {
				glaf++;
			}
			
		}
		
		if(flag+1==arr.length)
		{
			System.out.println(" Ascending ");
		}
		else if(glaf+1==arr.length)
		{
			System.out.println(" Descending ");
		}
		else {
			System.out.println(" Random ");
		}
			
		System.out.println("---------------------");
	}
	
	private static void printArray(int[] arr) {
		System.out.print("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{5,14,35,90,139};
		int ar2[] = new int[] {88,67,35,14,-12};
		int ar3[] = new int[] {65,14,129,34,7};
		
				

		printArray(ar);
		orderArray(ar);
		printArray(ar2);
		orderArray(ar2);
		printArray(ar3);	
		orderArray(ar3);
		
		
		
	
        
        
		
	}
	
	


	
}
