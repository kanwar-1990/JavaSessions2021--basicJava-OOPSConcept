package Javainterviewquestions;

public class PassingNULL {

	public static void main(String args[])

	{

		test(null);
	}

	public static void test(Object o) {
		System.out.println("The Object Argument");
	}
	public static void test(String s) {
		System.out.println("The String Argument");
	}
}
