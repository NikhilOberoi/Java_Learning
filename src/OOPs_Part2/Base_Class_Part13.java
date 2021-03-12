package OOPs_Part2;

public class Base_Class_Part13 extends Super_Class_Part13{ // we can't extends more than one class Java Doesn't support multiple inheritance
	
	public static void main(String[] args){
		Super_Class_Part13 SC = new Base_Class_Part13(); // Up-Casting
		SC.stop(); 	// It will call stop() method from Superclass
		SC.start(); // It will call start() method from Base Class - as non static method override
//		SC.test(); //  Throws error as super Class Object ref. belong to methods those are only available in Super Class
		
		Base_Class_Part13 BC = new Base_Class_Part13();
		BC.stop(); // It will call stop() method from Base class as object reference belongs to Base class
		BC.start();// It will call start() method from Base Class - as non static method override.
		BC.models();// It can call the super class methods as base class extends super class.
	}
	
	public static void stop(){
		System.out.println("Static Stop Method of Base Class");
	}
	
	public void start(){ // Super_Class Method Override
		System.out.println("Non Static Start Method of Base Class");
	}
	
	public void test(){
		start();
	}
	
	public void models(String model_Name, int model_Year){// overloading super class method in base class
		System.out.println("models() method of Base class with two Parameters");
	}
}
	