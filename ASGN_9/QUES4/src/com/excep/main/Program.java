package com.excep.main;

import java.util.Scanner;

//Arithmatic Exception
public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int a = 1;
		try {
			a=a/0;
			
			
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
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

