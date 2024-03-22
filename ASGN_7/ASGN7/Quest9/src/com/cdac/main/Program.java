package com.cdac.main;

import java.util.Arrays;



//9) Write a program which generates the series 1,4,27,16,125,36

public class Program {
	

	
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)
		{
			if(i%2==0)
			{
				System.out.print((int)Math.pow(i, 2)+" ");
			}
			else
			{
				System.out.print((int)Math.pow(i, 3)+" ");
			}
		}

        
        
		
	}
	
	


	
}
