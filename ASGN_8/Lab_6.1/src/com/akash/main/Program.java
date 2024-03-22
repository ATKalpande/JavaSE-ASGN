package com.akash.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//System.out.print("Enter date (dd/mm/yyyy)	 :");
		//System.out.print("Enter date (mm/dd/yyyy)(HH:mm:ss)	 :");
		System.out.print("Enter date (yyyy/mm/dd) :");
		String strDate = sc.nextLine();
		//a)SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
		
		
		try {
				Date parsedDate = sdf.parse(strDate);
				System.out.println("ParsedDate : "+parsedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
