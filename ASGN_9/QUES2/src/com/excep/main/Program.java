package com.excep.main;

import java.util.Scanner;

//Arithmatic Exception
public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Try-Catch Exception :");
		try {
			System.out.println("Enter the first number :");
			int num1= sc.nextInt();
			if(num1%2!=0)
			{
				Throwable te = new Throwable("Odd number Exception");
				throw te;
			}
			
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
			System.out.println("Program Closed");
		}
		
		
	}
}


/*O/P - > Try-Catch Exception :
Enter the first number :
13
java.lang.Throwable: Odd number Exception
	at com.excep.main.Program.main(Program.java:15)
Program Closed*/
