package com.cdac.main;

import java.util.Arrays;

// 2) Write a Java program to check the equality of two arrays?

public class Program {
	

	private static void equalArray(int[] ar, int[] ar1) {
		boolean result = Arrays.equals(ar, ar1);
		

		
		/*if(ar.length==ar1.length)
		{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]!=ar1[i])
				{
					result = false;
				}
			}
		}
		else {
			result = false;
		}*/
		
		if(result==true)
		{
			System.out.println("Arrays are Eqaul ");
		}
		else {
			System.out.println("Arrays are not Equal ");
		}
		
	}
	
	private static void printArray(int[] arr,int []ar2) {
		System.out.println("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		System.out.println("The given array ar2 is :");
		Arrays.stream(arr).
		forEach(System.out::println  );
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{12,34,212,45,5,2,};
		int ar1[] = new int[] {12,34,212,45,5,2};
		printArray(ar,ar1);
		equalArray(ar,ar1);
	}


	
}
