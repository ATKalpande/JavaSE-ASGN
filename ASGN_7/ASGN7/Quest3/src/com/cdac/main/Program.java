package com.cdac.main;

import java.util.Arrays;

//3) Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

public class Program {
	

	private static void equalSum(int[] ar, int n) {
		
		int sum =0;
	    for(int i=0;i<ar.length;i++)
	    {
	    	sum = sum + ar[i];
	    }
	    
	    if(sum==n)
	    {
	    	System.out.println("Sum is equal to the number :"+n);
	    }
	    else {
	    	System.out.println("Sum is not equal to the number :"+n);
	    }
	}
	
	private static void printArray(int[] arr) {
		System.out.println("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{5,10,15,20,25};
		
		printArray(ar);
		equalSum(ar, 75);
		
	}


	
}
