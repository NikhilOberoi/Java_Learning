package Basic_OOP;

public class wrapper_Classes_Part_11 {
	
	public static void main(String[] args){
		int x =10;
		String y = "20";
		
		//Before Data Conversion
		System.out.println("No Data Conversion : "+x+y);
		
		//After Data Conversion String to Integer:
		int z = Integer.parseInt("20");

		System.out.println(x+z);
		System.out.println("With Data Conversion : "+(x+z));
		System.out.println("Without Braces : "+x+z);
		
		// Data Conversion Integer to String:
		int j = 2000;
		String k = String.valueOf(j);
		String Concat = " paid by Joy";
		System.out.println(k);
		System.out.println(k+Concat);
		
		//Double:
		String l= "200";
		double m= Double.parseDouble(l);
		System.out.println(m);
		
		// Boolean:
		String d = "True"; 
		boolean c = Boolean.parseBoolean(d);// for String true/TRUE/True it gives true
		System.out.println(c);
		d= "Some other string";
		c= Boolean.getBoolean(d);// for other String it gives false
		System.out.println(c);
		
	}

}
