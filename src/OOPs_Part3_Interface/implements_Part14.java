package OOPs_Part3_Interface;

public class implements_Part14 implements Interface_Part14, Interface_Part14_1 {

	@Override
	public void debit() {

		System.out.println("debit() method of implements class");
	}

	public void display() {
		System.out.println("This is the implementation of Display Method" + Interface_Part14.bal_min);
	}

	// Achieving multiple Inheritance
	public void Show() {
		Interface_Part14.super.display();
		Interface_Part14_1.super.display();
//		Interface_Part14_1.display();
	}

	public static void main(String[] args) {
		implements_Part14 im = new implements_Part14();
		im.debit(); // Normal Interface Implemented Method Invoked
		im.Show();// Implementing multiple Inheritance.
		
//		Interface_Part14 IM = new Interface_Part14(); // Can't perform this as we can't create object of interface
	}

	@Override
	public void def() {
		// TODO Auto-generated method stub
		
	}
}
