package ImpJavaSesssion;

public class StringConcat {

	public static void main(String[] args) {

		String s1 = "Hello World"; // it will create an object inside the memory ---non premitive data
		System.out.println(s1);

		String s2 = "1000";// s2 is an string not an integer
		System.out.println(s2);

		int a = 100;
		int b = 200;

		double a1 = 10.40;
		double b1 = 20.50;

		// string is allways about concatenate and char is about ASCII CODE

		String x = "Hello";
		String y = "World";

		// allways in a programe execution starts from top to bottom and left to right
		// in terms of line codinh
		// first complier will come to a and then b and then perform the action
		System.out.println(a + b);// 200
		System.out.println(x + y);// this will be treated concatenated//Hello World
		System.out.println(x + y);// ill be treated concatenated//Hello World

		System.out.println(a + b + x + y); // 300HellowWorld
		System.out.println(x + y + a + b);// Helloword100200 ---as this will be conidered as a concatenate

		System.out.println(x + y + (a + b));// HellowWorld300 ---allways

		System.out.println("the value of a " + a); // this also will be considered as concate--100

		System.out.println("the value of a " + b); // this also will be considered as concate--200

		System.out.println("the value of a and b " + a + b); // this also will be considered as concate--100200
		System.out.println(+(a + b)); // this wil be considered as arthemetic expresion

		char c1 = 'a'; // in the programing language they consider character as unique code bases on
						// ASCII Table
		char d1 = 'b';

		System.out.println(c1 + d1); // 195 only during the time of plus i t will consider ASCII VALUE
		System.out.println(c1); // a
		System.out.println(c1 + d1); // OUTPUT==1
		System.out.println(x + c1 + d1); // OUTPUT==helloab
		System.out.println(c1 + d1 + x); // OUTPUT==195Hello

		// a-z=97-122
		// A-Z=65-90
		// 0-9=48-57

		System.out.println(x + c1);

		System.out.println(4 / 2);
		System.out.println(5 / 2);// 2.5

		System.out.println(5 / 0);// this will given you arthimetic expersion
		System.out.println(0 / 10);// OUTPUT==0
		System.out.println(4 % 2);// OUTPUT IS ZERO , reminder is none, as this is considered as modulus operator
		System.out.println(5 % 2); // 2*2=4, 5-4 is 1 hence u will get as putput 1

	}

}
