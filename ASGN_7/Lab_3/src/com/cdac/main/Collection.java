package com.cdac.main;


import java.util.Arrays;
import java.util.Scanner;

public class Collection {
	private static Scanner sc = new Scanner(System.in);
	
	private int []arr;
	
	public Collection() {
		//this.arr = new int[3];
		this(3); //Chainig
	}
	
	public Collection(int length) {
		
		//this.arr.length = length; //Not OK The final field array.length cannot be assigned
		
		this.arr = new int[length]; //
	}


	
	public  void acceptRecord(/*int[] arr -> this.arr */) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<this.arr.length;i++)
		{
			System.out.print("Enter Element at arr["+i+"] : ");
			arr[i]=sc.nextInt();
			
		}
		
	}

	public  void printRecord(/*int[] arr -> this.arr */) {
		// TODO Auto-generated method stub
		if(this.arr!=null)
		{
			System.out.println("Array Elements are :");			
			
			//int a =Integer.parseInt(Arrays.toString(arr));  //Type mismatch: cannot convert from String to int
			//Exception in thread "main" java.lang.NumberFormatException: For input string: "[1, 2, 3, 4]"
			String s = Arrays.toString(this.arr);
			System.out.println(s);
		}
		
		
	}
	
}
