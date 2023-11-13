package rev_Java_Core;

public class mainMethodOverload {

	public static void main(String[] args) {
		System.out.println("main method");

		main(1);
	}
	
	public static void main(String arg1)
	{
		System.out.println("main method 2");
	}
	
	public static void main(int arg1)
	{
		System.out.println("main method 3");
	}

}
