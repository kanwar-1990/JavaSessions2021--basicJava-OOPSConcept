package CodingBat;

public class CodingBatStringPractice3 {

	public static void main(String[] args) {
		System.out.println(lastTwo("coding"));
		System.out.println(seeColor("xxred"));
		CodingBatStringPractice3 cb = new CodingBatStringPractice3();
		System.out.println(cb.minCat("Hello", "Hi"));

	}

	public static String lastTwo(String str) {
		/*
		 * lastTwo("coding") → "codign" lastTwo("cat") → "cta" lastTwo("ab") → "ba"
		 */
		if (str.length() < 2) {
			return str;

		} else

			return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);

	}

	public static String seeColor(String str) {
		// seeColor("redxx") → "red"
		// seeColor("xxred") → ""
		// seeColor("blueTimes") → "blue"

		if (str.startsWith("red")) {
			return str.substring(0, 3);
		} else if (str.startsWith("blue")) {
			return str.substring(0, 4);
		} else
			return "";
	}

	public String minCat(String a, String b) {
		/*
		 * minCat("Hello", "Hi") → "loHi" minCat("Hello", "java") → "ellojava"
		 * minCat("java", "Hello") → "javaello"
		 * 
		 */
		if (a.length() == b.length())

			return a + b;

		else if (a.length() > b.length()) {

			int diff = a.length() - b.length();

			return a.substring(diff, a.length()) + b;

		} else {

			int diff = b.length() - a.length();

			return a + b.substring(diff, b.length());

		}

	}

}
