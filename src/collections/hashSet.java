package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class hashSet {
	public static void main(String[] arg) {
		HashSet<String> hm1 = new HashSet<String>();
		HashSet<String> hm2 = new HashSet<String>();
		
		//---------------------ADD-----------------
		hm1.add("Nikhil");
		hm1.add("Prathana");
		hm1.add("Sapna");
		hm1.add("Isha");
		hm1.add("Sandeep");
		hm1.add("Nikhil");// it will not add as HashSet Stores unique values only.
		hm2.add(null);
		
		// the output will not be in order
		System.out.println(hm1);
		System.out.println(hm1);
		
		//--------------------CONTAINS----------------
		System.out.println("\n"+hm1.contains("Nikhil"));
		System.out.println(hm1.contains("Nikh"));
		
		//---------------------isEmpty----------------
		System.out.println("\n"+hm1.isEmpty());
		System.out.println(hm2.isEmpty());
		
		//---------------------REMOVE-----------------
		hm1.remove("Nikhil");
		System.out.println("\n"+hm1);
		
		// Remove if
		hm1.removeIf(a->a.charAt(0)=='S');
		System.out.println("\nAfter remove keys having first letter as S: "+hm1);
		
		//RemoveAll
		hm2.add("Isha");
		System.out.println("\nhm2: "+hm2+"\nhm1 before removing hm2 from hm1: "+hm1);
		hm1.removeAll(hm2);
		System.out.println("hm1 after removing: "+hm1);
		
		//-----------------REPLACE--------------------
		String oldValue = "Prathana";
		String newValue = "Nikhil";
		if(hm1.contains(oldValue)) {
			hm1.remove(oldValue);
			hm1.add(newValue);
		}
		else {
			System.err.println("The Value you would like to replace doesn't exsist");
		}
		
		System.out.println(hm1);
		
		//------------------CLONE and Clear-----------------
		hm2.clear();
		System.out.println(hm2);
		
		hm2 = (HashSet<String>) hm1.clone();
		System.out.println("\nafter clone hm1: "+hm1+"\nand hm2: "+hm2);
		
		Iterator<String> it = hm1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//------------------Sort----------
//		Collections.sort(hm1);// can be only work for List
		
	}
}