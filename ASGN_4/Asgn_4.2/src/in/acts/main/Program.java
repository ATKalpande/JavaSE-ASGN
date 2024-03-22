package in.acts.main;


/*3)Create a class Employee with multiple overloaded methods that have different parameter types (e.g., 
int, double, String). Demonstrate calling each overloaded method with appropriate arguments.*/
public class Program {
	public static void Salary(String type,int basic )
	{
			//
		System.out.println("Emp Type :"+" "+type+" Basic Salary :"+basic);
	}
	
	
	
	public static int Salary(String type,int basic,int expenditure )
	{
			//
		int total_sal = basic+expenditure;
		System.out.println("Emp Type :"+" "+type+" Salary :"+total_sal);
		return 0;
	}
	public static void Salary(String type,int basic,float allowance )
	{
			//
		int total_sal = basic + (int) allowance;
		System.out.println("Emp Type :"+" "+type+" Salary :"+total_sal);
	}
	
	
	
	public static void main(String[] args) {
		Salary("Manager", 12345);
		Salary("HR", 1235, 12300);
		Salary("Developer",2400,2333);
	}
	
	
	
}
