package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {

		ArrayList<String> L1 = new ArrayList<String>();
		ArrayList<Integer> L2 = new ArrayList<Integer>();
		ArrayList<String> L3 = new ArrayList<String>();
		ArrayList<String> L4 = new ArrayList<String>();
		
		// -------------------- Is Empty --------------------
		//isEmpty?
		System.out.println("is L1 Empty?: "+L1.isEmpty()+"\n");

		L1.add("Nikhil");			L2.add(2);
		L1.add("Oberoi");			L2.add(3);
		L1.add("Prathana");			L2.add(4);
		L1.add("Chawla Oberoi");	L2.add(5);
		
//		L2.add(null);//it can be add but throws nullPointer error while working with Collecion.
		
		System.out.println("To get Value by Index: "+L1.get(1));
		//isEmpty?
		System.out.println("is L1 Empty?: "+L1.isEmpty()+"\n");
		
		System.out.println("This to get the Data Object on Index Basis: "+L2.get(3)+"\n");
//		System.out.println("This to get the Data on Object Basis: "+L2.get(Integer.valueOf(2)));
		
		// ------------------------- adding Elements ---------------
		for (String name : L1) {
			System.out.println("Names are in List: " + name);
		}

		// it will add the data on 2nd Index
		L1.add(2, "Alok");

		System.out.println("\nAfter Adding Data at specific index of Array List");
		for (String name : L1) {
			System.out.println("Names are in List: " + name);
		}

		// Adding All
		L3.addAll(L1);
		System.out.println("\nAfter Adding all elements from L1 to L3");
		for (String name : L3) {
			System.out.println("Names are in List L3: " + name);
		}

		// Adding all from Specific index
		L3.addAll(3, L1);
		System.out.println("\nAfter Adding all elements from L1 to L3 on Sepcific Index: ");
		for (String name : L3) {
			System.out.println("Names are in List L3: " + name);
		}
		
		// ----------------Index of Objects-----------------
		// Index of an Object: Since There are 2 Oberoi in the List it will return the
		// index of first One.
		System.out.println("\nIndex of Nikhil in L3: " + L3.indexOf("Nikhil")+"\n");
		
		// Last Index of Object
		System.out.println("\nLast index of Nikhil in L3: "+L3.lastIndexOf("Nikhil")+"\n");
		
		//-------------------- Remove Objects --------------
		//Remove the first occurrence of the specified element.
		L3.remove("Nikhil");
		L3.remove(3); // it will remove Object at Index
		
		L2.remove(2); // it will remove Object at Index 2
		L2.remove(Integer.valueOf(5)); // this will remove the Object
		
		//Remove Range
//		L2.removeRange(0,2);
		
		Iterator<String> LL3 = L3.iterator();
		while(LL3.hasNext()) {
			System.out.println("After Deleting an object from L3: "+LL3.next());
		}
		
		Iterator<Integer> LL2 = L2.iterator();
		while(LL2.hasNext()) {
			System.out.println("After Removing an Object from L2: "+LL2.next());
		}
		
		// remove Objects with specific condition
		System.out.println("\n");
		L3.removeIf(n-> (n.charAt(0)=='P'));		
		Iterator<String> LL4 = L3.iterator();
		while(LL4.hasNext()) {
			System.out.println("After Deleting an object starting with P from L3: "+LL4.next());
		}
		
		//----------------------Replace-------------
		//Replace All Specified Objects
		
		System.out.println("\n");
		L3.replaceAll(e-> e.replace("Oberoi","Heya"));
		
		//Replace Object at index 2
		L3.set(2,"Happy");
		
		Iterator<String> LL5 = L3.iterator();
		while(LL5.hasNext()) {
			System.out.println("After Replacing an object starting with P from L3: "+LL5.next());
		}

		
		//Retail All
		System.out.println("Retain All:\nL1: "+L1);
		System.out.println("L3: "+L3);
		L1.retainAll(L3);
		for(String name: L1) {
			System.out.println("L1 after Retain all: "+name);
		}
		
//		L1.retainAll(L4);
//		System.out.println("L1 After Retain an empty List: "+L1);
		
		//-------------Sort------------
		L2.add(1);
		System.out.println("\nL2 Before Sort: \n"+L2);
		Collections.sort(L2);
		System.out.println("L2 after sorting:\n"+L2);
		
		System.out.println("\nL3 Before Soritng: \n"+L3);
		Collections.sort(L3);
		System.out.println("L3 After Sorting:\n"+L3);
		
		//------------Sublist--------------
		System.out.println("\nSublist of L3 from Index 1 to 4: "+L3.subList(1,4));
		
		//------------Reverse A list------
		Collections.reverse(L3);
		System.out.println("L3 After Reverse:\n"+L3);
		
		//------------Contains--------------
		System.out.println("\nL3 Contains Hey: "+L3.contains("Hey"));
		System.out.println("\nL3 Contains Hey: "+L3.contains("Heya"));
		
		//----------Clear/RemoveAll--------
		System.out.println("\nL1 is: "+L1);
		System.out.println("\nL3 Before Remove All L1 Elements: "+L3);
		System.out.println(L3.removeAll(L1));
		System.out.println(L3.removeAll(L1));
		System.out.println("\nL3 after removing all L1 Elements: "+L3+" and Size is: "+L3.size());
		
		L3.clear();
		System.out.println("\nAfter clear L3: "+L3+" and Size is: "+L3.size());
	}
}
