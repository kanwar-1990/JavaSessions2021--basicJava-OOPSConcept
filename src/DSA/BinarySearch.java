package DSA;

public class BinarySearch {

	public static void main(String args[]) {
		// Binary Search works only on sorted Array
		int arr[] = { 3, 4, 5, 6, 7, 8, 9, 10 };
		int Element_Search;
		int lnth = arr.length;

		int result = binarySearch(arr, 11, 0, lnth - 1);
		if (result == -1) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element is found");
		}

	}

	public static int binarySearch(int arr[], int Element_Search, int low, int high) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == Element_Search)
				return mid;
			// 6<10
			if (arr[mid] < Element_Search)
				low = mid + 1;
			else
				high = mid - 1;

		}

		return -1;
	}
}
