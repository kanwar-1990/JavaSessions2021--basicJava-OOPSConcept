package DSA;

public class ArrayLinearSearch {

	public static void main(String[] args) {

		// Based on Linear Search---Searching the element by travesing in an array
		// works on both=== sorted and unsorted array

		int a[] = { 10, 20, 50, 30, 60 };

		int Search_Item = 30;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			if (Search_Item == a[i]) {
				System.out.println("The Searched Element is found : " + i);
				break;
			}

		}

	}
}
