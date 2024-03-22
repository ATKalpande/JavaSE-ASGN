package com.cdac.main;

import java.util.Arrays;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [][]arr = new int[][] {{1,2,3,4},{"A","B","C","D"}};
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++) {
				System.out.print("Enter the element :");
				arr[row][col] =sc.nextInt();
			}
		}
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
			
	}
}
