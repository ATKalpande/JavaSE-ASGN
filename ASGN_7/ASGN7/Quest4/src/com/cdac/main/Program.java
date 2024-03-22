package com.cdac.main;

import java.util.Arrays;

//4)  Write a program to reverse an Array in java .


public class Program {
	

	private static void reverseArray(int[] arr) {
		
		int temp = 0;

		for ( int i = 0; i < arr.length / 2 ; i++ ){
			temp = arr [ i ]; 
			arr [ i ] = arr [ arr.length - 1 - i ]; 
			arr [ arr.length-1 - i ] = temp;  
		}
		
		System.out.println(Arrays.toString(arr));


	    
	   
	}
	
	private static void printArray(int[] arr) {
		System.out.println("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{5,10,15,20,25};
		
		printArray(ar);
		reverseArray(ar);
		
	}


	
}
