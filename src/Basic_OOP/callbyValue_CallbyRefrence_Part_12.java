package Basic_OOP;

public class callbyValue_CallbyRefrence_Part_12 {
	int i = 80;
	int j = 100;

	public static void main(String[] args) {
		callbyValue_CallbyRefrence_Part_12 call = new callbyValue_CallbyRefrence_Part_12();
		// call by value:
		int k = call.sum(10, 20);
		System.out.println(k);
		int y = 10;
		int z = 2 - 1;
		// Pass by Value:
		System.out.println(call.sum(y, z));

		// call by reference:
		int multiple = call.mult(call);// calling non static method and passing class object ref. to access global
										// variable in method
		System.out.println("Call By Ref:" + multiple);
	}

	public int sum(int j, int k) {
		return j + k;
	}

	public int mult(callbyValue_CallbyRefrence_Part_12 A) {// here we pass the Class Object Ref. instead of Values
		int mul = A.i * A.j;
		return mul;
	}
}
