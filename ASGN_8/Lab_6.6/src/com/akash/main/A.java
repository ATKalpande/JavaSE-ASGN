package com.akash.main;

public class A {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int res = j*8+i;
				System.out.println(res);
			}
			System.out.println();
		}
	}
}
