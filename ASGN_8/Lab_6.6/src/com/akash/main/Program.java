package com.akash.main;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		//static  int a=10;  //Illegal modifier for parameter a; only final is permitte
			int day = 03;
			int month = 12;
			int year = 2024;
			
			Calendar calendar = Calendar.getInstance();
			
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.DAY_OF_MONTH, day);
			calendar.set(Calendar.MONTH, month-1);
			
			System.out.println("Old Date "+day+"/"+month+"/"+year);
			
			calendar.add(Calendar.DAY_OF_MONTH,12 );
			day = calendar.get(Calendar.DAY_OF_MONTH);
			month = calendar.get(Calendar.MONTH);
			year = calendar.get(Calendar.YEAR);
			
			
			System.out.println("New Date "+day+"/"+month+"/"+year);
			
			
	}
	
	public static void main3(String[] args) {
		LocalDate date = LocalDate.now();
		
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public static void main2(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH)+1;
		int year = calendar.get(Calendar.YEAR);
		
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public static void main1(String[] args) {
		Date date = new Date(); //depricated
		
		int day = date.getDay();
		int month = date.getMonth() + 1;
		int year = date.getYear()+1900;
		
		System.out.println(day+"/"+month+"/"+year);
	}
}




