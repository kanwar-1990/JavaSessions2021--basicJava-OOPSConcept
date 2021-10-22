package Javainterviewquestions;

public class Palindrome {

	// input -123,Output-321---not a pallindrome
	// input-121, Output-121--is a pallindrome
	public static void main(String args[]) {
		int n = 133, r, s = 0;

		int t = n;
		while (n > 0) {
			r = n % 10;// 1
			n = n / 10;// 12
			s = s * 10 + r; // 121
		}
		if (t == s) {
			System.out.println("Is Pallindrome");
		} else {
			System.out.println("Not a Pallindrome");
		}
	}

}
