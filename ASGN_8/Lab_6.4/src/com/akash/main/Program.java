package com.akash.main;

import java.util.Scanner;

class Ebill{
	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	
	public Ebill(String customerName, double unitsConsumed) {
		
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
	}
	
	public void calculateBillAmount()
	{
		for(int i=1;i<=this.unitsConsumed;i++)
		{
			if(i<100)
			{
				this.billAmount = billAmount + 5;
				
			}
			else if(i<200)
			{
				this.billAmount = billAmount + 7;
				
			}
			else {
				this.billAmount = billAmount + 10;
				
			}
		}
	}
	
	public void dispInfo()
	{
		System.out.println("Customer NAme   :"+this.customerName);
		System.out.println("UnitConsume     :"+this.unitsConsumed);
		System.out.println("billAmount      :"+this.billAmount);
		
	}
	
	
}

public class Program {
	public static void main(String[] args) {
		Ebill bill = new Ebill("Akash",200);
		bill.calculateBillAmount();
		bill.dispInfo();
	}
}
