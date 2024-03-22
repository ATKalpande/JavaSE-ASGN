package in.acts.cdac;

public class Wide {
	/*4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and 
prints the result.*/
	public static void main(String[] args) {
		int a = 20;
		double d = a;
		float f = a;
		boolean b = (a != 0);
		System.out.println("Int value of a:  "+a);
		System.out.println("Double value of a:  "+d);
		System.out.println("Float value of a:  "+f);
		System.out.println("Boolean value of a:  "+b);
	}
	/*3) Write a program that performs arithmetic operations involving different data types (int, double, float) 
and observes how Java handles widening conversions automatically.*/
	public static void main3(String[] args) {
		int a = 20;
		float f = 12.f;
		double d = 12233.3d;
		double result = a+f+d;
		  double sub = a-f-d;
		  double mult = a*f*d;
		  double div = a/f/d;	//Widening
		System.out.println(a+f+d);
	}
	
	/*2) Create a program that demonstrates narrowing conversion from double to int and prints the result. 
 */
	
	public static void main2(String[] args) {
		double a = 10.2222d;
		int b = (int) a;	//Narrowing
		System.out.println(b);
	}
	/*1) Write a program that demonstrates widening conversion from int to double and prints the result. 
 */
	public static void main1(String[] args) {
		int a = 10;
		double d = a;
		System.out.println(d);  //Widening
	}
}
