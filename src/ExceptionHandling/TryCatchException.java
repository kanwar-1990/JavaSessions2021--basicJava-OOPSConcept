package ExceptionHandling;

public class TryCatchException {

	public static void main(String[] args) {

		try {

			int a = 1, b = 0, c;
			c = a / b;// Should give Arithmetic exception
			int[] i = new int[3];
			i[5] = 10;// Arrayindexout of bound

		} catch (ArithmeticException a) {
			a.printStackTrace();
			System.out.println("Arthimetic Exception found");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Please check the Array size");
		}

		System.out.println("let me be printed");
	}

}
