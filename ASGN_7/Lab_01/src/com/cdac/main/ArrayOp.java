package com.cdac.main;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayOp {
	private static Scanner sc = new Scanner(System.in);
	public static void acceptArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter Element at arr["+i+"] : ");
			arr[i]=sc.nextInt();
			
		}
		
	}

	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		if(arr!=null)
		{
			System.out.println("Array Elements are :");			
			Arrays.stream(arr).forEach(System.out::println);
		}
		
		
	}
	
}
