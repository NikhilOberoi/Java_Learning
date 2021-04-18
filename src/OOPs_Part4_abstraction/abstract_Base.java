package OOPs_Part4_abstraction;

public class abstract_Base extends abstract_library{
	
	abstract_Base(){
		System.out.println("abstract_Base constructor");
	}

	@Override
	public void connectServer() {
		System.out.println("this is connectServer method of backend interface, implements in abstract_Base");
	}

	@Override
	public void books() {
		System.out.println("this is the abstrct method of abstract_library");
	}

	@Override
	public void department() {
		System.out.println("this is the department method of abstract_library");	
	}
	
//	public void returnbooks() {
//		System.out.println("this is the returnbooks method of abstract_library");
//	}
//	
//	public static void issuebooks() {
//		System.out.println("this is the issuebooks method of abstract_library");
//	}

	public void bookfee() {
		System.out.println("this is the bookfee method of abstract_library");
	}
	@Override
	public void closeServer() {
		System.out.println("this is close Server method of backend interface, implements in abstract_Base");
	}
	
	public static void main(String[] args) {
		issuebooks();
		abstract_Base ab = new abstract_Base();
		
		ab.returnbooks();
		ab.department();
		
//		abstract_library al = new abstract_library(); // we can't create object of abstract class - as class is abstract in nature
		abstract_library alb = new abstract_Base(); // we can create reference Variable of abstract Class.
		issuebooks();
		ab.returnbooks();		
	}
}
