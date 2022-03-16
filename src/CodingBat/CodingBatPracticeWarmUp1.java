package CodingBat;

public class CodingBatPracticeWarmUp1 {

	public static void main(String args[]) {
		System.out.println(stringTimes("Hi", 4));
		System.out.println(frontTimes("Chocolate", 3));
	System.out.println(stringSplosion("Code"));
	
	
	}

	public static String stringTimes(String str, int n) {
		// stringTimes("Hi", 2) → "HiHi"

		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + str;
		}

		return result;
	}

	public static String frontTimes(String str, int n) {
		// frontTimes("Chocolate", 3) → "ChoChoCho"
		// frontTimes("Abc", 3) → "AbcAbcAbc"
		if (str.length() > 3) {
			return str + str + str + str;
		}

		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + str.substring(0, 3);
		}
		return result;
	}

	int countXX(String str) {

		// countXX("abcxx") → 1
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 2).equals("xx")) {
				count++;
			}
		}
		return count;
	}

	boolean doubleX(String str) {
		// doubleX("axxbb") → true

		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).contains("xx"))
				return true;
		}
		return false;
	}
	
	public static String stringSplosion(String str) {
//	stringSplosion("Code") → "CCoCodCode"

       String result="";
       for(int i=0;i<str.length();i++)
       {
result=result+str.substring(0,i+1);
       }
		
		return result;
	}

	public int arrayCount9(int[] nums) {
	//arrayCount9([1, 2, 9]) → 1
         int count=0;
   		for(int i=0;i<nums.length;i++)
   		{
   			if(nums[i]==9)
   			{
   				count++;
   			}
   		}
		return count;
	}
	public boolean arrayFront9(int[] nums) {
	//arrayFront9([1, 2, 9, 3, 4]) → true
		
		int end = nums.length;
		if (end > 4) {
			end = 4;
		}
		for (int i = 0; i < end; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}
		return false;
	}	
	
	public boolean array123(int[] nums) {
	//array123([1, 1, 2, 3, 1]) → true

		for(int i=0;i<nums.length-2;i++)
		{
			if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)
			{
				return true;
			}
		}
		return false;
	}	
	
	
}
