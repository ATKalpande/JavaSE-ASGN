package in.acts.main;

import in.acts.dac.Student;

public class Program {
	public static void main(String[] args) {
		Student std = new Student();//std is ref of student instance
		
		std.addStd(); //addStd(std)
		std.printStd();
	}
	
}
