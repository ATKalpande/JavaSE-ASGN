package com.cdac.main;

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
	
		
	
	}
}
