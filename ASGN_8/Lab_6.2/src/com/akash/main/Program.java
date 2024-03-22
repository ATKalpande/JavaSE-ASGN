package com.akash.main;


import java.util.Scanner;
import java.util.Date;

class Bmi{
	private static Scanner sc = new Scanner(System.in);
	private double height;
	private double weight;
	
	public Bmi() {
		//super();
		this.height = 0.0;
		this.weight = 0.0;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public double bmi()
	{
		
		
		double res = this.getWeight() / (this.getHeight()*this.getHeight());
		//System.out.println("BMI is :"+res);
		return res;
	}
	
	
}

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Bmi b = new Bmi();
		System.out.println("Enter the height in m:");
		b.setHeight(sc.nextDouble());
		System.out.println("Enter the weight in kg:");
		b.setWeight(sc.nextDouble());
		System.out.println("BMI  :"+b.bmi());
			
		
	}
}
;