package com.excep.main;

import java.util.Scanner;

//Arithmatic Exception
public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		try {
			int a[] = new int[] {12,43,14,56,67,6};
			int sum = 0;
			for(int i=0;i<8;i++)
			{
				System.out.println(a[i]);
			}
			
		} catch (Exception e) {
		      
			e.printStackTrace();
			// TODO: handle exception
		}
		
		finally {
			System.out.println("Finally block");
		}
		
	}
}

/*12
43
14
56
67
6
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
	at com.excep.main.Program.main(Program.java:14)
Finally block
*/

