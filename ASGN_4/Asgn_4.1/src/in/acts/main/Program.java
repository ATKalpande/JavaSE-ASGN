package in.acts.main;


/*Write a Vehicle class with overloaded methods that have a different number of parameters. 
Demonstrate calling these overloaded methods with various numbers of arguments.*/
public class Program {
	public static void displayIn(String name,String Color)
	{
		System.out.println("Name of vehicle"+name+" "+"\nColor of vehicle"+Color);
	}
	
	
	
	public static int  displayIn(int no_of_wheel,double amount,String engine_type)
	{
		System.out.println("No of Wheel :"+no_of_wheel+" "+"Amount :"+amount);
		return 0;
	}
	
	public static void main(String[] args) {
		displayIn("Xuv 700", "Black");
		displayIn(4, 1200000, "Petrol");
	}
	
	
	
}
