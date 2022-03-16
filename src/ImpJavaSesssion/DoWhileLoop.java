package ImpJavaSesssion;

import org.omg.Messaging.SyncScopeHelper;

public class DoWhileLoop {

	public static void main(String[] args) {

		// allways, intilize,give condition, increase the loop
		int p = 1;
		do {
			System.out.println(p);
			p++;
		} while (p <= 10);

		// for each loop ---basically used in JaVA Streams with JDK 8 for ArrayList
		// for each method is used after JDK 8

		int marks[] = new int[5];// index is 5 from 0 to 4
		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		marks[4] = 500;

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// for each loop----enhanced for loop

		for (int i : marks) {
			System.out.println(i);
		}

		while (true) {
			int i = 9;
			if (i > 10) {
				System.out.println("Pass");
				break;
			} else {
				System.out.println("Fail");
				break;
			}
		}

	}

}
