package com.cdac.main;

import java.util.Arrays;

//1. Write a program to print elements of Array ? 
public class Program {
	
	private static void printArray(int[] arr) {
		System.out.println("The given array is :");
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{12,34,212,45,5,2,};
		printArray(ar);
	}

	
}
