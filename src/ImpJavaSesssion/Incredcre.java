package ImpJavaSesssion;

public class Incredcre {

	public static void main(String[] args) {

		// Post increment

		int a = 100;
		int b = a++;
		System.out.println(a);// 101
		System.out.println(b);// 100--- left to right coding so a value is given to b and a is incremented

		// pre increment
		int c = -99;
		int d = ++c;

		System.out.println(c);// -98
		System.out.println(d);// -98

		// post decrement

		int w = 400;
		int z = w--;

		System.out.println(w);// 399
		System.out.println(z);// 400

		// pre decrement
		int f = 32;
		int h = --f;

		System.out.println(f);// 31
		System.out.println(h);// 31

		int total = 1000;
		System.out.println(total++); // same rule total value is given to total and increment--1000
		System.out.println(total);// in the next line it is printed--1001

		int bal = 100;
		System.out.println(++bal);// increase the value of balance and then give it--101

		char r = 'a';
		System.out.println(++r);// b will be the output

		// for boolean it will give the error as the outcome is the true an false

	}

}
