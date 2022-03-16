package CodingBat;

public class CodingBatStringPractice11 {

	public static void main(String args[]) {

		System.out.println(countYZ("fez day"));
		System.out.println(countTriple("xxxabyyyycd"));
	System.out.println(sumDigits("aa1bc2d3"));
	
	}

	public static int[] middleWay(int[] a, int[] b) {

		// middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]

		return new int[] { a[1], b[1] };

	}

	public int[] makeEnds(int[] nums) {
		// makeEnds([1, 2, 3]) → [1, 3]

		return new int[] { nums[0], nums[nums.length - 1] };

	}

	public boolean has23(int[] nums) {
		// has23([2, 5]) → true

		if (nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2) {
			return true;
		}
		return false;
	}

	public boolean no23(int[] nums) {
		// no23([4, 5]) → true
		if (nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2) {
			return false;
		}
		return true;

	}

	public boolean double23(int[] nums) {
		// double23([2, 2]) → true

		if (nums.length < 2) {
			return false;
		}
		if (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3) {
			return true;
		}
		return false;

	}

	public int[] fix23(int[] nums) {
		// fix23([1, 2, 3]) → [1, 2, 0]

		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
			return nums;
		} else if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
			return nums;
		}
		return nums;
	}

	public int start1(int[] a, int[] b) {
		// start1([1, 2, 3], [1, 3]) → 2
		if (a[a.length] < 1 || b[b.length] < 1) {
			return 0;
		}

		if (a[0] == 1 || b[0] == 1) {
			return a[0] + b[0];
		}
		return 0;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		// biggerTwo([1, 2], [3, 4]) → [3, 4]

		if (a[0] > b[0] && a[1] > b[1]) {
			return new int[] { a[0], a[1] };
		}
		return new int[] { b[0], b[1] };

	}

	public int[] makeMiddle(int[] nums) {
		// makeMiddle([1, 2, 3, 4]) → [2, 3]
		if (nums.length > 2) {
			return nums;
		}

		int num = nums[nums.length - 1 / 2];
		return new int[] { nums[num - 1], nums[num] };
	}

	public int[] plusTwo(int[] a, int[] b) {
		// plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]

		return new int[] { a[0], a[1], b[0], b[1] };
	}

	public static int countYZ(String str) {
		/**
		 * countYZ("fez day") → 2 countYZ("day fez") → 2 countYZ("day fyyyz") → 2
		 * 
		 */
		int count = 0;
		String str1 = str.toLowerCase();
		String wordset[] = str1.split("[^a-z]");

		for (String word : wordset) {
			if (word.endsWith("z") || word.endsWith("y"))

			{
				count++;
			}
		}

		return count;

	}

	public static int countTriple(String str) {
		// countTriple("abcXXXabc") → 1
		// countTriple("xxxabyyyycd") → 3

		int len = str.length();
		int count = 0;

		for (int i = 0; i < len - 2; i++) {
			char temp = str.charAt(i);

			if (temp == str.charAt(i + 1) && temp == str.charAt(i + 2)) {

				count++;

			}

		}
		return count;
	}

	public static int sumDigits(String str) {

		// sumDigits("aa1bc2d3") → 6
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			if(Character.isDigit(str.charAt(i))) {
			String temp = str.substring(i, i + 1);
			sum +=Integer.parseInt(temp);
			}
		}

		return sum;
	}

}
