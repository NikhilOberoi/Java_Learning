package collections;
import java.util.LinkedHashSet;
public class linkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String>lhs = new LinkedHashSet<String>();
		
		lhs.add("Nikhil");
		lhs.add("Prathana");
		lhs.add("Someone");
		lhs.add("test User");
		lhs.add("Nikhil");
		System.out.println(lhs);
	}
}
