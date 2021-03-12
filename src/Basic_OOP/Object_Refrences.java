package Basic_OOP;

public class Object_Refrences {
	//Class Variable OR Global Variable.
	int model;
	int Wheels;
	public static void main(String [] args){
		
		int model;
		model = 2018;
		// To access local variable we don't need any class refrence.
		System.out.println("Local Variable model :"+model);
		System.out.println("Jai Mata Di");
		
		// We can only access Class variables by creating class reference , as below:
		Object_Refrences A = new Object_Refrences();
		Object_Refrences B = new Object_Refrences();
		Object_Refrences C = new Object_Refrences();
		
		A.model = 2013;
		A.Wheels = 5;
		B.model = 2014;
		B.Wheels = 4;
		C.model = 2015;
		C.Wheels = 3;
		
		System.out.println("Model of A:"+A.model);
		System.out.println("Wheel of A:"+A.Wheels);
		System.out.println("Model of B:"+B.model);
		System.out.println("Wheel of B:"+B.Wheels);
		System.out.println("Model of C:"+C.model);
		System.out.println("Wheel of C:"+C.Wheels);
		
		A=B;
		B=C;
		C=A;
		
		System.out.println("--------After Swap----------");
		System.out.println("Model of A:"+A.model);
		System.out.println("Wheel of A:"+A.Wheels);
		System.out.println("Model of B:"+B.model);
		System.out.println("Wheel of B:"+B.Wheels);
		System.out.println("Model of C:"+C.model);
		System.out.println("Wheel of C:"+C.Wheels);
		
	}
}
