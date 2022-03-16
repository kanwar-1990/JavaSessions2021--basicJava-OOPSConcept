package CodingBat;

import java.util.Arrays;

public class CodingBatPractice13 {

	public static void main(String args[]) {
		int value[] = { 1,1,0,0};
		int[] value1 = { 2, 10, 3, 4, 20, 5 };

		/*
		 * System.out.println(has77(value)); System.out.println(has12(value));
		 */

		// System.out.println(haveThree(value));
		// int[] values=shiftLeft(value);
		// System.out.println(Arrays.toString(values));
		// System.out.println(values.toString());
		int[] boom = tenRun(value1);
		// System.out.println(Arrays.toString(boom));
		int[] hello = post4(value);
		System.out.println(Arrays.toString(hello));
		int[] hello2=zeroFront(value);
		
		System.out.println(Arrays.toString(hello2));
	}

	public static boolean has77(int[] nums) {
		// has77([1, 7, 7]) → true
		boolean result = false;

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 7 && nums[i + 1] == 7)
				result = true;
			if (nums[i] == 7 && nums[i + 2] == 7)
				result = true;

		}
		return result;
	}

	public static boolean has12(int[] nums) {
		// has12([1, 3, 2]) → true
		boolean foundOne = false;
		boolean foundOneTwo = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				foundOne = true;
			}
			if (nums[i] == 2 && foundOne) {
				foundOneTwo = true;
			}
		}
		return foundOneTwo;

	}

	public boolean modThree(int[] nums) {
		// modThree([2, 1, 3, 5]) → true
		int odd = 0;
		int even = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				even++;
			}

		}
return true;
	}

	public static boolean haveThree(int[] nums) {
		// haveThree([3, 1, 3, 1, 3]) → true
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				count++;
				if (count < 3) {
					flag = false;
				}
				flag = true;
			}

		}
		return flag;
	}

	public boolean twoTwo(int[] nums) {

		// twoTwo([4, 2, 2, 3]) → true
		boolean flag = false;
		if (nums.length == 0) {
			return true;
		}
		if (nums.length == 1 && nums[0] == 2)
			return false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2 && nums[i + 2] != 2) {
				flag = true;
			}
			flag = false;
		}

		return flag;
	}

	public static int[] shiftLeft(int[] nums) {

		// shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]

		for (int i = 0; i < nums.length - 1; i++) {
			int temp = nums[i];// 6
			nums[i] = nums[i + 1];// 2 6
			nums[i + 1] = temp;// 2

		}
		return nums;
	}

	public static int[] tenRun(int[] nums) {
		// tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] % 10 == 0) {
				if (nums[i + 1] % 10 != 0) {
					nums[i + 1] = nums[i];
				}
			}
		}

		return nums;
	}

	public static int[] post4(int[] nums) {
		// post4([2, 4, 1, 2]) → [1, 2]

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4) {
				return Arrays.copyOfRange(nums, i + 1, nums.length);

			}
		}

		return new int[0];

	}
	
	
	
	public static int[] zeroFront(int[] nums) {

		//zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]

int count=0;
for(int i=0;i<nums.length;i++)
{
	  if(nums[i]==0) {
	  nums[i]=nums[count];
	  nums[count]=0;
	  count++;
	  }
}
	return nums;	
	}


}
