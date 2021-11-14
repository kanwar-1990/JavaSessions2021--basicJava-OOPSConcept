package Javainterviewquestions;

public class SwapNumber {
	public static void main(String[] args) {

		swapNum(5, 10);
		swapNuWithOutTemp(5, 10);
	}

	public static void swapNum(int x, int y) {
		int temp;
		System.out.println("The value of x is :" + x);
		System.out.println("The value of y is :" + y);
		/*
		 * input x=5 y=10 output y=5 x=10
		 * 
		 */
		System.out.println("*******************");
		temp = x;// 5
		x = y;// 10
		y = temp;

		System.out.println("The value of x is :" + x);
		System.out.println("The value of y is :" + y);
		System.out.println("*******************");

	}

	public static void swapNuWithOutTemp(int x, int y) {
		/*
		 * input x=5 y=10 output y=5 x=10
		 */
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		System.out.println("*******************");

		x = x + y;// 15
		y = x - y;
		x = x - y;
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

	}

}
