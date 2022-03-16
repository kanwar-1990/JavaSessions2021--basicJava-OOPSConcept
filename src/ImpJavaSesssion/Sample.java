package ImpJavaSesssion;

public class Sample {
	static int k = 20;

	public static void main(String[] args) {
		Sample s = new Sample();
		s.show();

	}

	public void show() {
		k = 30;

		System.out.println("**********Import the package *******");
		int i[] = new int[2];
		i[0] = 10;
		i[1] = 20;
		for (int args = 0; args < i.length; args++) {
			System.out.println(i[args]);
		}
		System.out.println(k);

	}

	/*
	 * In all Wrapper classes toString() is overridden(defaultly) and it prints
	 * value of object not complete information of object. Integer a=new
	 * Integer(100); System.out.println(a.toString());//100
	 */
}
