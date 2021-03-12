package OOPs_Part3_Interface;

public interface backend {

	public void connectServer();

	public default void typeOne() {
		System.out.println("This is the type One of Implementing methods in Interface");
	}

	public static void typeTwo() {
		System.out.println("This is type Two of Implementing methods in Interface");
	}

	public static void executer() {
		System.out.println("Executer method implemented in backend interface");
	}

}
