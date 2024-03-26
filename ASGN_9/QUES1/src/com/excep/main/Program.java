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
			System.out.println("Enter the Second number :");
			int num2 = sc.nextInt();
			System.out.print("Resutl :"+num1/num2);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
	}
}


/*O/P - > Enter the first number :
10
Enter the Second number :
0
java.lang.ArithmeticException: / by zero
	at com.excep.main.Program.main(Program.java:15)*/
