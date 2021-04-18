package Basic_OOP;

public class variable_defaultvalues {
	int a;
	String b;
	
	variable_defaultvalues(){
		System.out.println(a+b);
	}
	
	public static void main(String [] args) {
		int c;
		String d;	
		
//		System.out.println(a+b); // Can't mate non-static ref to static field
//		System.out.println(c+d); // local variables not initialized.
		
		
		
		variable_defaultvalues vd = new variable_defaultvalues();
		
	}
}
