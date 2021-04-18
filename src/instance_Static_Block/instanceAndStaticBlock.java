package instance_Static_Block;

public class instanceAndStaticBlock extends superClass{
	
	int amount;
	int salary;
	//instance Block
	{	//executes after super class constructor and before base class constructor.
		
		System.out.println("This is the Instance Block 1");
	}
	
	// static block 
	static { // executes before main method.
		System.out.println("This is the Static Block");
	}
	
	{
		System.out.println("This is the Instance Block 2");
	}
	
	instanceAndStaticBlock(){
		System.out.println("Base Class Constructor");
	}
	
	instanceAndStaticBlock(int a){
		System.out.println("Base Class Constructor with an argument "+a);
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		instanceAndStaticBlock iS = new instanceAndStaticBlock();
		instanceAndStaticBlock IS = new instanceAndStaticBlock(12);
	}
}
