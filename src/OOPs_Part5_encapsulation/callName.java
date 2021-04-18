package OOPs_Part5_encapsulation;

public class callName {
	
	public static void main(String[] args) {
		student s1 = new student();
		s1.setName("Nikhil");
//		s1.getName();
		System.out.println("Name is: "+s1.getName()+"\n");
		
		s1.rollnoSet(12345);
		s1.rollnoGet();
		System.out.println("Roll Number is: "+s1.rollnoGet());
	}
}
