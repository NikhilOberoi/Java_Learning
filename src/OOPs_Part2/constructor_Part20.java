package OOPs_Part2;

public class constructor_Part20 {
	
	int a;
	String college = "MLN College";
	
	constructor_Part20(int a){ // Parameterized constructors
		System.out.println("constructor with an argument having int type and Value :"+a);
	}
	
	constructor_Part20() {
		System.out.println("Default Constructor with no arguments");
	}
	
	public constructor_Part20(String a){ //overload constructor
		System.out.println("constructor with an argument having String type and value :"+a);
	}
	
	void display(){
		System.out.println("Display Method");
	}
	
	constructor_Part20(String student_Name, int rollno){ // Overload Constructor
		System.out.println("Student Name is: "+student_Name+" having Roll Number: "+rollno+" and College Name is: "+college);
		
	}
	
	public static void main(String[] args){
		constructor_Part20 cnstr = new constructor_Part20(); // calling default const.
		constructor_Part20 cnstr1 = new constructor_Part20(12); // calling const. with arguments
		constructor_Part20 cnstr2 = new constructor_Part20("Nikhil"); // calling const. with arguments
		constructor_Part20 student = new constructor_Part20("Prathana",112233);
		cnstr2.display();
		cnstr1.display();
		System.out.println(cnstr1.a);
	}
}
