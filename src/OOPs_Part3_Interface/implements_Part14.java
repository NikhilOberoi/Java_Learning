package OOPs_Part3_Interface;

public class implements_Part14 implements Interface_Part14, Interface_Part14_1 {
	@Override
	public void debit() {

		System.out.println("debit() method of implements class");
	}

	public void display() {
		System.out.println("This is the implementation of Display Method");
	}

	// Achieving multiple Inheritance
	public void Show() {
		Interface_Part14.super.display();
		Interface_Part14_1.super.display();
	}

	public static void main(String[] args) {
		implements_Part14 im = new implements_Part14();
		 im.debit(); // Normal Interface Implemented Method Invoked
		im.Show();// Implementing multiple Inheritance.
		
		
	}
}
