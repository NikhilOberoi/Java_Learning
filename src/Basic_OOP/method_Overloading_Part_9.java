package Basic_OOP;

public class method_Overloading_Part_9 {
	
	public static void main (String[] args){
		method_Overloading_Part_9 exc = new method_Overloading_Part_9();
		
		exc.main(10); // Main method overloading;
		exc.sum();
		exc.sum(12);
		exc.sum("Hello World");
		exc.sum("ABC", 15);
		
	}
	public void main (int i){
		System.out.println("Value of i "+i);
	}
	
	public void sum(){
		System.out.println("This is sum method without arguments");
	}
	
	public void sum(int j){
		System.out.println("This is sum method with one argument with argument type int and Value is:"+j);
	}
	
	public void sum(String text){
		System.out.println("This is sum method with one argument with argument type String and Value is:"+text);
	}
	
	public void sum(String text, int w){
		System.out.println("This is sum method with two argument with argument types String and int and Value are:"+text+" and "+w);
	}
}
