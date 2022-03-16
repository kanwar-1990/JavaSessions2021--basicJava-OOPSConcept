package CodingBat;

import java.util.Arrays;
import java.util.Collections;

public class CodingBatPractice12 {

	public static void main(String args[]) {
		int[] value = { 1, 2, 1, 3 };

		// System.out.println(sum28(value));

		// System.out.println(fizzArray(10));
		// System.out.println(no14(value));
		System.out.println(isEverywhere(value, 1));

	}

	public static int countEvens(int[] nums) {

		// countEvens([2, 1, 2, 3, 4]) → 3

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		return count;

	}

	public static int centeredAverage(int[] nums) {

		Arrays.sort(nums);

		int count = 0;

		int sum = 0;

		for (int i = 1; i < nums.length - 1; i++) {

			sum += nums[i];

			count++;
		}

		return sum / count;

	}

	public int sum13(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {
				return 0;
			}

			if (nums[i] != 13) {
				count += nums[i];
			} else
				i++;

		}
		return count;
	}

	public int sum67(int[] nums) {

		// sum67([1, 2, 2]) → 5
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 6) {
				sum += nums[i];
			} else {
				while (nums[i] != 7) {
					i++;
				}
			}
		}
		return sum;
	}

	public static boolean lucky13(int[] nums) {
		// lucky13([0, 2, 4]) → true

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				return false;
			}
		}

		return true;

	}

	public static boolean sum28(int[] nums) {
		// sum28([2, 3, 2, 2, 4, 2]) → true
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				sum += nums[i];
			}

			if (sum == 8) {
				return true;
			}
		}

		return false;
	}

	public static boolean more14(int[] nums) {
		// more14([1, 4, 1]) → true

		int count1 = 0;
		int count4 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count1++;
			}
			if (nums[i] == 4) {
				count4++;
			}
		}
		if (count1 > count4) {
			return true;
		} else {
			return false;
		}

	}

	public static int[] fizzArray(int n) {
		// fizzArray(4) → [0, 1, 2, 3]
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = i;
		}
		return result;
	}

	public static boolean no14(int[] nums) {

		boolean count1 = false;
		boolean count4 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count1 = true;
			}
			if (nums[i] == 4) {
				count4 = true;
			}

		}
		if (count1 && count4) {
			return false;
		}
		return true;
	}

	public static boolean isEverywhere(int[] nums, int val) {
		// isEverywhere([1, 2, 1, 3], 1) → true

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] != val && nums[i + 1] != val) {
				return false;
			}
		}

		return true;
	}

	public boolean either24(int[] nums) {

		if (Arrays.toString(nums).contains("2,2") && Arrays.toString(nums).contains("4,4"))
			return false;
		if (Arrays.toString(nums).contains("2,2") || Arrays.toString(nums).contains("4,4"))
			return true;
		return true;
	}

}
