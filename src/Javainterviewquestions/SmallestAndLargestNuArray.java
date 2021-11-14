package Javainterviewquestions;

import java.util.Arrays;

public class SmallestAndLargestNuArray {

	public static void main(String... args) {
		int arr[] = { -10, 50, 24, 984567 };
		int Largest = arr[0];
		int Smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > Largest) {
				Largest = arr[i];
			} else if (arr[i] < Smallest) {
				Smallest = arr[i];
			}
		}
		System.out.println("The ArrayList are ::" + Arrays.toString(arr));
		System.out.println("The Largest Number is ::" + Largest);
		System.out.println("Smallest number is ::" + Smallest);

	}

}
