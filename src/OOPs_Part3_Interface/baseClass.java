package OOPs_Part3_Interface;

public class baseClass extends bsuperClass implements backend {

	// non static method Implements the backend class method defined
	public void connectServer() {
		System.out.println("Connect Server Implementation in baseClass");
	}

	// non Static Method Overriding the bSuperClass Method
	public void closeServer() {
		System.out.println("------------closeServer Method of bSuperClass Override in Base Class");
	}

	// Achieving Multiple Inheritance by calling typeOne() Method
	public void multiInheritance() {
		System.out.println("this is the type one to execute the default type method implemented in Interface\n");
		backend.super.typeOne();
	}

	public static void main(String[] args) {
		baseClass bc = new baseClass();
//		bsuperClass sc = new baseClass();

		bc.multiInheritance();
		
		System.out.println("This is the type two to execute the Static Method implemenrted in Interface\n");
		backend.typeTwo();
		
		bc.closeServer();
		bc.connectServer();
	
	}

}
