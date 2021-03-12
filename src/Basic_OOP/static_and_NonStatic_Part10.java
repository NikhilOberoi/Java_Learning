package Basic_OOP;

public class static_and_NonStatic_Part10 {
	
	static int J =10; // static global variable - can call directly (Such variables freely available in memory)
	int K = 20; // non-static global variable - can only call through object reference.
		
	public static void main(String[] args){
		//initializing class object Reference..
		static_and_NonStatic_Part10 call = new static_and_NonStatic_Part10();
		
		System.out.println("Static Global Variable :"+J);// can access directly
		System.out.println("Static Global Variable through class Object :"+call.J);// Static Variable can also be call through object ref.
		System.out.println("Non-Static Method :"+call.K);// can access through class object reference only.
		
		//Calling static methods:
		multi(10,5);
		System.out.println("string method return :"+string("This is me"));
	
	}
	// Static Method:
	public static void multi(int i, int j){
		System.out.println("Multiplication is : "+i*j);	
	}
	
	public static String string (String text){ // non-void method..
		return text;
	}
	
}
