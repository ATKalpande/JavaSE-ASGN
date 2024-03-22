package com.cdac.main;

import java.util.Arrays;



//4)  Write a program to reverse an Array in java .


public class Program {
	

	private static void maxMinElement(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int element:arr)
		{
			if(max<element)
			{
				max = element;
			}
			else if(min>element)
			{
				min = element;
			}
			
		}
		
		System.out.println("Max is :"+max+" Min is :"+min);
	}
	
	private static void printArray(int[] arr) {
		System.out.println("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{5,10,115,2,25};
		
		printArray(ar);
		maxMinElement(ar);
		
	}


	
}
