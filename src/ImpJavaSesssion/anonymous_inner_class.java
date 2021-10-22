package ImpJavaSesssion;

@FunctionalInterface
interface DemoTest {
	// Only possible after Java 8
	void show();

	default int showbizz() {
		int i = 10;
		return i;

	}

	default void showbizzzz() {
		System.out.println("Showbizzzzzzzzzzzzz");
	}

	static void showbizzzzzzzzzz() {
		System.out.println("Static method.......");
	}

}

public class anonymous_inner_class {
	public static void main(String[] args) {

		/*
		 * DemoTest d1=new DemoTest() {
		 * 
		 * @Override public void show() {
		 * System.out.println("I this is an annonimus inner class   "); }
		 * 
		 * };
		 */

		// To overcome anonymous inner class ,and to have an boiler code avoided we can
		// use a lamda expression

		DemoTest d1 = () -> System.out.println("I this is an annonimus inner class"); //
		DemoTest.showbizzzzzzzzzz();

		System.out.println(d1.showbizz());
		d1.show();
		d1.showbizzzz();
		d1.showbizz();
	}

	static void showbizzzzzzzzzz() {
		System.out.println("hello ");
	}
}
