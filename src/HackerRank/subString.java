package HackerRank;

public class subString {
	public static void main(String[] args) {
		String a = "AAABBBCCAB";
		System.out.println(a.length());
		System.out.println(a.substring(0,0));
		System.out.println(a.substring(2));
		a = a.substring(0,1)+a.substring(2);
		System.out.println("this: "+a);
	}
}