package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() throws ArithmeticException {

		System.out.println("m1");
		m2();
	}

	public void m2() throws ArithmeticException {
		System.out.println("m2");
		m3();
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3");
		//Best Way to capture is this in Throws Exception
		
		try {
			m4();

		} catch (ArithmeticException e) {
System.out.println("Arhtimetic Exception found.....");
		e.printStackTrace();
		}
	}

	public void m4() throws ArithmeticException {

		System.out.println("m4");

		/*try {
			int i = 9 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Arthimetic Exception found.....");
			e.printStackTrace();

		}
*/	
		}

	public static void main(String[] args) /*throws ArithmeticException*/ {

		// We are passing the buck of Exception from m4 to m1 and Main method
		// Which is not correct and where is noisy
		// Either we can create a try block in the method which is creating error or in
		// m3 method as well

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

}
