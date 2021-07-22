package ImpJavaSesssion;

public class Assignment1 {

	public static void main(String[] args) {

		// 1. WAP to print following output:

		for (int bat = 0; bat <= 5; bat++) {
			System.out.println("I am Batman");
		}

		// 2. WAP to print following output:

		for (int batman = 1; batman <= 5; batman++) {
			System.out.println("i am batman " + batman);
		}

		// 3. WAP to print 10 to 1 using for, while and do-while loop

		for (int rev = 10; rev > 0; rev--) {
			System.out.println(rev);
		}

		int rev1 = 10;
		while (rev1 > 0) {
			System.out.println(rev1);
			rev1--;
		}

		int rev2 = 10;
		do {
			System.out.println(rev2);
			rev2--;
		} while (rev2 > 0);

		// 4. Write a program in Java to print "Hello World" ten times using while loop

		int Hello = 0;
		while (Hello > 10) {
			System.out.println("Hello World");
			Hello++;
		}

		// 5. Write a program in Java to print 1 to 10 using while loop but quit if
		// multiple of 7 is encountered

		for (int WAP = 1; WAP <= 10; WAP++) {
			System.out.println(WAP);
			if (WAP % 7 == 0) {
				break;
			}
		}
		// 1. Write a Java program to print 'Hello' on screen and then print your name
		// on a separate line.
		// Expected Output :
		/*
		 * Hello  Naveen K
		 */

		System.out.println("Hello");
		System.out.println("Naveen K");
		/*
		 * 2. Write a Java program to print the sum of two numbers.  Test Data:  74 +
		 * 36  Expected Output : 110
		 */

		System.out.println(+(74 + 36));

		/*
		 * 3. Write a Java program to divide two numbers and print on the screen.  Test
		 * Data :  50/3 Expected Output : 16
		 * 
		 */

		System.out.println(+(50 / 3));

		/*
		 * 4. Write a Java program to print the result of the following operations.
		 * Change your test data accordingly. Test Data: a. -5 + 8 * 6 b. (55+9) % 9  c.
		 * 20 + -3*5 / 8  d. 5 + 15 / 3 * 2 - 8 % 3  Expected Output :
		 */
		/*
		 * 43  1  19  13
		 */

		System.out.println(+(-5 + 8 * 6));
		System.out.println(+((55 + 9) % 9));

		/*
		 * 5. Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor Test Data:
		 */

		System.out.println(+(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))));

		/* 6. Try to concat "Hello Selenium" with a character 't'. */

		System.out.println("Hello Selenium" + 't');

	}
}
