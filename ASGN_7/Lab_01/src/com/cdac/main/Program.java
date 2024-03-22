package com.cdac.main;

import java.sql.Date;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the size of Array :");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
	
		
		ArrayOp.acceptArray(arr);
		ArrayOp.printArray(arr);
		
		boolean ar1 [] = new boolean[4];
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		
		Date[] date = new Date[4];
		System.out.println(date[2]);
		System.out.println(date[0]);
		
		/*Array deccl
 warn:The value of the local variable arr is not used
		int arr[] = new int[] {1,2,3,4};
		int index = 0;
		
		Arrays.stream(arr)
		.forEach(System.out::println);
		
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	
		 * for (int element : arr) {
			System.out.println(element);
		}
		 * do {
			System.out.println("Element at pos "+index+" "+arr[index]);
			++index;
		} while (index<arr.length);
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for (int element : arr) {
			System.out.println(arr[element]);
		}
		
		
		int[] arr2 = null;
		arr2 = new int[3];
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		*/
		
		
	
	}
}
