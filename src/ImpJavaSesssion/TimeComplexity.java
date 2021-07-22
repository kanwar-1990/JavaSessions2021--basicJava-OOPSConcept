package ImpJavaSesssion;

public class TimeComplexity {

	public static void main(String[] args) {

		/*
		 * Time Complexity-- Is not specific to any Language B(O)--is used in time Complexity
		 * below are the anotation for time complexity
		 * O(1) ex--for one time execution----int i=10;
		 * O(n)ex--for one for loop
		 *O(n^2) ex--for two for loop
		 *O(n^n)
		 */

		int i = 10; // O(1)--As it will be calculated only once

		System.out.println(i);// O(1) after that it will 0(n) only--- As it will be calculated only once

		for (int k = 1; k < 10; k++) {
			System.out.println(k);
			// Since it will be calculated 10 time we will not call it O(10)
			// We need to call it as O(n)---
			
		}

	}
}