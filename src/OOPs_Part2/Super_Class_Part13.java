package OOPs_Part2;

public class Super_Class_Part13 {

	public int sum(int a, int b) {
		return a + b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public void start() {
		System.out.println("Start Method of Super Class");
	}

	public static void stop() { 
		System.out.println("Static Stop Method of Super Class");
	}

	public void models(){
		System.out.println("models() method without parameter of Super Class");
	}
	
	public void models(String model_Name){// method overloading in same class
		System.out.println("models() method with one Parameter");
	}
	
//	public static int models() { // it will throw duplicate method error as we are defining same method name with return type.
//		System.out.println("Check method of Super Class");
//		return 10;
//	}
	
	public String check(int a) {
		return "this";
	}
	
	// public static void main(String[] args){
	// stop();
	// Super_Class sc = new Super_Class();
	// sc.start();
	// }
}
