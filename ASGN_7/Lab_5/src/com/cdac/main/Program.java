package com.cdac.main;

import java.util.Arrays;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	private static void aceeptRecord(int[]arr) {
		
		int i=0;
		do {
			System.out.println("Enter the element :");
			arr[i] = sc.nextInt();
			i++;
			
		}while(i<arr.length);
		
	}

	private static void sumOfElement(int []arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of Array :"+sum);
		
	}
	
	private static void averageOfElement(int []arr) {
		int avg=0;
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			avg = sum/arr.length;
			
		}
		System.out.println("Average of Array:"+avg);
		
	}
	

	private static void largesElement(int arr[]) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Largest element in Array:"+max);
		
	}
	
	
	private static void smallestElement(int []arr)
	{
		int min = arr[0];
		for(int element:arr)
		{
			if(element<min)
			{
				min = element;
			}
		}
		
		System.out.println("Smallest element in Array:"+min);
	}
	

	private static void printRecord(int []arr) {
		
		System.out.println("Contents of Array : ");
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void sortArray(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("Sorted Array:");
		System.out.println(Arrays.toString(arr));
		
	}

	
	public static void main(String[] args) {
		int arr[] = new int[4];
		Program.aceeptRecord(arr);
		Program.printRecord(arr);
		Program.sumOfElement(arr);
		Program.averageOfElement(arr);
		Program.largesElement(arr);
		Program.smallestElement(arr);
		Program.sortArray(arr);
		
		
	}






	












	
}
