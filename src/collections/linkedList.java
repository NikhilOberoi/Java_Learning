package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class linkedList {
	public static void main(String[] args) {
		LinkedList<String> L1 = new LinkedList<String>();
		LinkedList<String> L2 = new LinkedList<String>();
		LinkedList<String> L4 = new LinkedList<String>();
		LinkedList<Integer> L3 = new LinkedList<Integer>();
		
		L1.add("Raj");			L3.add(2);
		L1.add("Neha");			L3.add(13);
		L1.add("Prathana");		L3.add(4);
		L1.add("Nikhil");		L3.add(6);
		L1.add("Divya");		L3.add(10);
		
		//---------------------ADD----------------
		//add all:
		L2.addAll(L1);
		
		//add at index
		L1.add(1,"Supreme");
		
		// Add First and Last:
		L1.addFirst("First Name");
		L1.addLast("Last Name");
		
		System.out.println("\nL1 is:"+L1);
		System.out.println("\nL2 is:"+L2);
		
		//---------------------GET------------------
		System.out.println("\nRetrieve First Element of List L2: "+L2.element());
		System.out.println("\nReturns  First Element of List L2: "+L2.getFirst());
		System.out.println("\nReturns  Last  Element of List L2: "+L2.getLast());
		System.out.println("\nRetrieve nth   Element of List L2: "+L2.get(3));
		
//		System.out.println("\nRetrieve First Element of List L4: "+L4.element());// throws NoSuchElementException
//		System.out.println("\nReturns  First Element of List L4: "+L4.getFirst());// throws NoSuchElementException
//		System.out.println("\nReturns  Last  Element of List L4: "+L4.getLast()); // throws NoSuchElementException
//		System.out.println("\nRetrieve nth   Element of List L4: "+L4.get(3)); // throws Array OutOfBound error
		// to overcome above Exceptions we use PEEK
		
		//---------------------PEEK-------------------
		System.out.println("\npeek an element from L1: "+L1.peek());
		System.out.println("peekFirst an element from L1: "+L1.peekFirst());
		System.out.println("peekLast  an element from L1: "+L1.peekLast());
		
		System.out.println("\nL4 is:"+L4+"\npeek an element from L4: "+L4.peek());
		System.out.println("peekFirst an element from L4: "+L4.peekFirst());
		System.out.println("peekLast  an element from L4: "+L4.peekLast());
		
		//---------------------INDEX-----------------
		System.out.println("\nIndex of First Name in L1 is: "+L1.indexOf("First Name"));
		System.out.println("Index of Last Name in L1 is: "+L1.lastIndexOf("Last Name"));
		System.out.println("Index of non exsist Oject in L1 is: "+L1.indexOf("test")); // return -1
		
		//---------------------CONTAINS--------------
		System.out.println("\nif List L1 Contains an Object: "+L1.contains("First Name"));
		System.out.println("if List L1 not contains an Object: "+L1.contains("Name"));
		
		//---------------------Offers----------------
		L1.offer("Simran");// adds elements to last in list
		System.out.println("\nAfter offer an element List L1 is: "+L1);
		L1.offerFirst("Tracy");// add element to First in list
		System.out.println("After offerFirst an element List L1 is: "+L1);
		L1.offerLast("Lauren");// add element to Last in list
		System.out.println("After offerLast  an element List L1 is: "+L1);
		
		//--------------------POLL--------------------
		System.out.println("\n"+L1.poll());//retrieve and removes the first element in list
		System.out.println("after Poll L1: "+L1);
		System.out.println("\n"+L1.pollFirst());//retrieve and removes the first element in list
		System.out.println("after Poll First L1: "+L1);
		System.out.println("\n"+L1.pollLast());//retrieve and removes the Last element in list
		System.out.println("after Poll Last L1: "+L1);
		
		//--------------------POP and PUSH-------------
		//pops an element from the stack represented by a list.
		System.out.println("\nPop an element from stack represent as List L1: "+L1.pop());
		L1.push("PUSH");
		System.out.println("Push an element into stack represent as List L1: "+L1);
		
		//---------------------REMOVE------------------
		// Remove an Element
		System.out.println("\nBefore remove an element from List L1: "+L1);
		System.out.println(L1.remove("Neha"));//return true if removed successfully
		System.out.println(L1.remove("Ne"));//return false 
		System.out.println("After remove an elemeny from List L1: "+L1);
		
		//Remove first
		System.out.println("\nRemove First: "+L1.removeFirst());
		System.out.println("after removeFirst L1: "+L1);
//		System.out.println("removeFirst from empty Linklist L4: "+L4.removeFirst()); // throws NoSuchElementException
		
		//Remove first and last occurrence
		L1.add(1,"Divya");
		L1.add(6,"Supreme");
		System.out.println("\nL1 Before removeFirstOccurrence of Divya in L1: "+L1);
		System.out.println(L1.removeFirstOccurrence("Divya"));
		System.out.println("L1 after removeLastOccurrence of Divya in L1: "+L1);
		System.out.println(L1.removeLastOccurrence("Supreme"));
		System.out.println("L1 after removeLastOccurrence of Supreme in L1: "+L1);
		System.out.println(L1.removeLastOccurrence("Supr"));//returns false
		System.out.println("L1 after removeLastOccurrence of non-exsist element in L1: "+L1);
		
		//Remove first and last
		System.out.println("\nL1: "+L1);
		System.out.println(L1.removeFirst());
		System.out.println(L1.removeLast());
//		System.out.println(L4.removeLast()); // throws NoSuchElementException
		System.out.println("L1 after removing First and Last: "+L1);
		
		//------------------------CLONE and CLEAR-----------------------
		System.out.println("Before Clone L4: "+L4);
		
		L4= (LinkedList<String>) L1.clone();
		System.out.println("After Clone L4: "+L4);
		
//		L1= (LinkedList<String>) L4.clone();
//		System.out.println(L1);
		L4.clear();
		System.out.println("After Clear L4: "+L4);
		 	
		//---------------------Iterate LinkedList--------------------------
		
		//Traversing elements in reverse order
		Iterator<String> i = L1.descendingIterator();
		System.out.println("\n Iterate Descending:\nL1 is: "+L1);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Traversing elements of list
		Iterator<String> j = L1.iterator();
		System.out.println("\nIterator: ");
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		//Traverse through listIterator - Previous
		ListIterator<String> li = L1.listIterator(L1.size());
		System.out.println("\nListIterator using Previous");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		// Traverse through ListIterator - Next
		ListIterator<String> LI = L1.listIterator();
		System.out.println("\nListIterator using Next");
		while(LI.hasNext()) {
			System.out.println(LI.next());
		}
	}
}