package collections;

import java.util.HashMap;
public class hashMap {
	public static void main(String[] args) {
	HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
	hm1.put(1,"Nikhil");
	hm1.put(2,"Prathana");
	hm1.put(3,"Oberoi");
	hm1.put(4,"Madhav");
	hm1.put(1,"Nikhil Oberoi");
	hm1.put(null,null);
	hm1.put(5,null);
	
	System.out.println(hm1);
	
	}
}