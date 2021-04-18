package OOPs_Part3_Interface;

public interface Interface_Part14 {

	static int bal_min = 100;
	int max_bal = 100000;
	
	// we can define methods as static but cant't declare them as static.
	public static void credit() {
		System.out.println("Credit Stati Method Declaration");
	}// we no need to define in implement class.
		
	public abstract void debit();// method declaration shouldn't be static.
	
	//default method
	public default void display(){
		System.out.println("Display default Method of Interface Part 14");
	}
	
	public void def(); // this is allowed
	
//	public void abc() { // this is not allowed.
//		
//	}

//	static void invalid(); // this is not allowed.
}