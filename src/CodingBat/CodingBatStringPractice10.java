package CodingBat;

public class CodingBatStringPractice10 {
	public static void main(String[] a) {

	}

	public boolean firstLast6(int[] nums) {

		// firstLast6([1, 2, 6]) → true
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;

		} else
			return false;

	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
			return true;
		} else
			return false;

	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };

	}

	public boolean commonEnd(int[] a, int[] b) {

		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}

	}

	public int sum3(int[] nums) {
		// sum3([1, 2, 3]) → 6
		return nums[0] + nums[1] + nums[nums.length - 1];

	}

	public int[] rotateLeft3(int[] nums) {
		return new int[] { nums[1], nums[2], nums[0] };
	}

	public int[] reverse3(int[] nums) {
		return new int[] { nums[2], nums[1], nums[0] };

	}

	public int[] maxEnd3(int[] nums) {
		// maxEnd3([1, 2, 3]) → [3, 3, 3]

		if (nums[0] > nums[2]) {
			return new int[] { nums[0], nums[0], nums[0] }; // {} this is array literals, Since the number of elements
															// we know is certain
		} else
			return new int[] { nums[2], nums[2], nums[2] };

	}

	public int sum2(int[] nums) {
		// sum2([1, 2, 3]) → 3

		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 0) {

			return 0;
		} else if (nums[0] + nums[1] >= 2) {
			return nums[0] + nums[1];
		}
		return 0;	
	}

}
