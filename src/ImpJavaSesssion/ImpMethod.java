package ImpJavaSesssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ImpMethod {

	public static void main(String args[]) {

		// Arrays

		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;

		for (int j = 0; j < i.length; j++)

		{
			System.out.println(Arrays.toString(i));
		}

		// Instead of this we can use Array Literals

		int i1[] = { 20, 30, 40, 50 };// Array Literals

		System.out.println(i1);// Array will print some garbage value of memory address
		System.out.println(Arrays.toString(i1));// Another way to print static array is

		// ArrayList

		System.out.println(i1.toString());
		// Another way to do this

		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(number);

		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));

		ArrayList<Integer> number2 = new ArrayList<Integer>(Arrays.asList(10, 30, 20, 40, 50));
		System.out.println(number2);

		Collections.sort(number2);
		System.out.println(number2);

	}

}
