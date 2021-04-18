package OOPs_Part2;

public class constructor_Base_Part20 extends constructor_Part20 {
	
	constructor_Base_Part20(){
		super();// super will call the default constructor of Super class
		System.out.println("Base class default constructor");
	}
	
	constructor_Base_Part20(int a){
		this(); // this will call default c onstructor of Base Class
		System.out.println("Base Class Constructor with one argument");
	}
	
	public static void main(String[] args){
//		constructor_Base_Part20 cp = new constructor_Base_Part20();
		constructor_Base_Part20 cp1 = new constructor_Base_Part20(34);
	}
}

// Point to Not:
// 1. Constructors can't be abstract, final, Static and Synchronized while method can be
