package com.cdac.main;

import java.util.Arrays;




//8).Write a program which takes an array of integers and prints the running average of 3 consecutive integers. 
//In case the array has fewer than 3 integers, there should be no output.
//Input: [5,14,35,89,140]
//Output: [18, 46, 88] 
//(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)


public class Program {
	

	private static void avgThreeConsect(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int c=0,sum=0;
			for(int j=i;j<=arr.length-1;j++)
			{
				sum=sum+arr[j];
				c++;
				if(c==3)
					break;
			}
			int d=sum/3;
			if(c==3)
			System.out.print(d+" ");
			
		}

		
		
		
		
	/*		
		double avg =0 ;
		
	
			for(int i=0;i<arr.length-1;i++)
			{
				int itra = 0;
				int sum = 0;
				for(int j=i;j<arr.length-1;j++)
				{
					sum=sum+arr[j];
					itra++;
					if(itra==3)
						break;
					
					
				}
				avg = sum / 3;
				if(itra==3)
				System.out.println(avg);
			}
			
			
			
			
			
			*/
		
		
		
		
		
	}
	
	private static void printArray(int[] arr) {
		System.out.println("The given array arr is :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		int ar[]=new int[]{5,14,35,89,140};

		printArray(ar);
		
        avgThreeConsect(ar);	
        
        
		
	}
	
	


	
}
