package Javainterviewquestions;

import java.util.Arrays;

public class CheckEleequalINArray {
	public static void main(String[] args) {

		int[] ar1 = { 1, 2, 3, 4, 5 };
		int[] ar2 = { 1, 2, 3, 4, 6 };
		/*
		 * boolean value = Arrays.equals(ar1, ar2);
		 * System.out.println("The given two array are equal or not :" + value);
		 */

		for (int i = 0; i <= ar1.length; i++) {
			{			
			if (ar1[i] != ar2[i]) {
				System.out.println("The values are  equal");
			}
			}
		}
	System.out.println("The values are not equal");
	}
}
	


