package OOPs_Part4_abstraction;

import OOPs_Part3_Interface.backend;

public abstract class abstract_library implements backend{

	public abstract void books();
	public abstract void department();
	public abstract void bookfee();
	
	public void returnbooks() {
		System.out.println("Non-static Method returnbooks");
	}
	public static void issuebooks() {
		System.out.println("Static Method issueBooks");
	}
}
