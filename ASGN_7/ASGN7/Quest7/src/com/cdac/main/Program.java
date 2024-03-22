package com.cdac.main;

import java.util.Arrays;



/*7)Write a program to merge two arrays of integers by reading one number at a time from each array until  one of the array is exhausted, and then concatenating the remaining numbers.
 Input: [23,60,94,3,102] and [42,16,74]
 Output: [23,42,60,16,94,74,3,102]
*/
public class Program {
	

	private static void conCanateArray(int[] arr,int[]ar1) {
		int n = arr.length + ar1.length;
		int temp[] = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			temp[i] = arr[i];
		}
		
		for(int i=0;i<ar1.length;i++)
		{
			temp[i+arr.length] = ar1[i];
		}
		
		System.out.println("Conccate Arrays is: "+Arrays.toString(temp));
		
	}
	
	private static void printArray(int[] arr) {
		System.out.print("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{23,60,94,3,102};
		int ar2[]= new int[] {42,16,74};
		
		printArray(ar);
		printArray(ar2);
		conCanateArray(ar,ar2);
		
	}


	
}
