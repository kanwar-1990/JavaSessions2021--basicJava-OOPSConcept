package ImpJavaSesssion;

public class IfElseConditions {

	public static void main(String[] args) {

		// conditional operator----->== ,!=.>=,<=
		// double is used for comparison
		// if condition is used for some verification , for testing also we will use on
		// the purpose to validation

		int a = 10;
		int b = 20;
		System.out.println(a == b);// what if we have houndred of variable hence we use if/else statement

		if (a == b) {
			System.out.println("hi");
		} else {
			System.out.println("false");
		}

		if (true) {
			System.out.println("testing");
		}
		// dead code
		else// this is a perfect example of dead code , as in the condition it will not come
			// to the dead part
		{
			System.out.println("development");
		}

		String s1 = "Selenium";
		String s2 = "selemium";

		if (s1.equals(s2)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		/*
		 * As jave is case sensitive hence we can use another method for ignoring the
		 * case sensitive
		 */

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");

		} else {
			System.out.println("both are not equal");

		}

		// nested if

		// IF condition inside if condition-- if first statement is not statified then
		// it will not got next if it will come out of the statement

		int marks = 100;

		if (marks <= 90) {
			System.out.println("print b grade");

			if (marks >= 50) {
				System.out.println("print c grade");
			}
		} else {
			System.out.println("FAILS");
		}

		// since its string equals to method is used, the problem with this if
		// else--example 160 things are to be checked, it will go to all the line if the
		// the condition is matched
		// statment is that all the if condition are checked

		String browser = "opera";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if (browser.equals("firfox")) {
			System.out.println("Launch firefox");
		}
		if (browser.equals("safari")) {
			System.out.println("launch safari");
		} else {
			System.out.println("right correct browser");
		}

		// if elseif------in this the program will match to statment and come out
		// disadvantage== in case it will check the all the condition also
		if (browser.equals("chrome"))

		{
			System.out.println("Launch chrome");
		} else if (browser.equals("firfox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("safari")) {
			System.out.println("launch safari");
		} else {
			System.out.println("type the correct browser");
		}

		// to find the maximum from 4 integers

		// && operator is to check the condition

		int i = 100;
		int j = 200;
		int k = 500;
		int l = 400;

		if (i > j && i > k && i > l)// FALSE=FALSE=FALSE=FALSE==FALSE
		{
			System.out.println("I IS THE HIGHEST");
		} else if (j > k && j > l) // FALSE=FALSE==FALSE
		{
			System.out.println("J IS THE HIGHEST");
		} else if (k > l) // FALSE
		{
			System.out.println("K IS THE HIGHEST");
		} else// TRUE
		{
			System.out.println("L IS THE HIGHEST");
		}

		// primitive data type, we usally use comparision operator,
		// string others like arraylist has a method to compare

		double d1 = 12.45;
		double d2 = 14.54;

		if (d1 == d2) {
			System.out.println("Hello");
		} else {
			System.out.println("world");
		}

		char c1 = 'a';
		char c2 = 'b';

		if (c1 == 98) {
			System.out.println("hey");
		} else {
			System.out.println("hello");
		}

	}

}
