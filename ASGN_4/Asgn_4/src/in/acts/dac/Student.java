package in.acts.dac;

import java.util.Scanner;

public class Student {
	private int Roll_no;
	private String Std_Name;
	private float Std_Marks;
	
	public void addStd(/*Stduent std==this*/) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Enter Roll No		:	");
			this.Roll_no=sc.nextInt();
			System.out.print("Enter Student Name	:	");
			this.Std_Name=sc.next();
			System.out.print("Enter Student Marks	:	");
			this.Std_Marks=sc.nextFloat();
		} 
		
	}

	public void printStd() {
		// TODO Auto-generated method stub
		System.out.println("Roll No			"+" "+this.Roll_no);
		System.out.println("Student Name		"+" "+this.Std_Name);
		System.out.println("Roll_Marks		"+" "+this.Std_Marks);
	}
	

}
