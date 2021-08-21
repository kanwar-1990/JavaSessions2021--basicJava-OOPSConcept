package CodingBat;

public class CodingBatStringPractice4 {

	public static void main(String[] args) {
		CodingBatStringPractice4 cb = new CodingBatStringPractice4();

		System.out.println(cb.extraFront("H"));
		System.out.println(cb.without2("Hi"));

	}

	public String extraFront(String str) {
		/*
		 * extraFront("Hello") → "HeHeHe" extraFront("ab") → "ababab" extraFront("H") →
		 * "HHH"
		 */ String s1;
		if (str.length() <= 1) {
			return str + str + str;
		} else
			s1 = str.substring(0, 2);
		return s1 + s1 + s1;

	}

	public String without2(String str) {
		/*
		 * without2("HelloHe") → "lloHe" without2("HelloHi") → "HelloHi" without2("Hi")
		 * → ""
		 */

		if (str.length() <= 2) {
			return str;
		} else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
			return str.substring(2, str.length());
		}
		return str;
	}

}
