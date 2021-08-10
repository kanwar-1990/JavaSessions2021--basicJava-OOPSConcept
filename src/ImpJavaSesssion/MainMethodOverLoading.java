package ImpJavaSesssion;

public class MainMethodOverLoading {

	public static void main(String[] args) {
		// JVM wILL ALLWAYS LOOK FOR the Above method ----
		System.out.println("Hello World*******");

		// Since these are declared as Static we can Call them directly
		main();
		main(10);
		main(10, 20);

	}

	public static void main() {

		System.out.println("main  Can be Overloaded by adding different parameter");

	}

	public static void main(int a) {
		System.out.println(a);

	}

	public static void main(int a, int b) {
		System.out.println(a + b);
	}

}
