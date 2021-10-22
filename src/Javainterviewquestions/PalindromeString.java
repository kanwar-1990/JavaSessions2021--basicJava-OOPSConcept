package Javainterviewquestions;

public class PalindromeString {

	// Input--->Selenium,Output--->muineleS

	public static void main(String args[]) {

		palindromStringCheck("Selenium");
		palindromStringCheck("Madam");

		
	}

	public static void palindromStringCheck(String s1) {

		String temp = s1;
		String rev = "";

		for (int i = s1.length() - 1; i >= 0; i--) {

			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);

		if (temp.equalsIgnoreCase(rev)) {
			System.out.println("   String is an Palindrome   ");
		} else {
			System.out.println("   String is not a palindrome   ");
		}

	}

}
