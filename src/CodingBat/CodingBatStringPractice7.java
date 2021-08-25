package CodingBat;

public class CodingBatStringPractice7 {

	public static void main(String[] args) {
		CodingBatStringPractice7 cb = new CodingBatStringPractice7();
		System.out.println(cb.bobThere("bac"));
		System.out.println(cb.xyBalance("aaxbby"));
		System.out.println(cb.mixString("Hi", "There"));

	}

	public boolean bobThere(String str) {

		/*
		 * bobThere("abcbob") → true bobThere("b9b") → true bobThere("bac") → false
		 */
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				return true;
			}
		}
		return false;
	}

	public boolean xyBalance(String str) {

		/*
		 * xyBalance("aaxbby") → true xyBalance("aaxbb") → false xyBalance("yaaxbb") →
		 * false
		 */

		if (str.lastIndexOf("y") < str.lastIndexOf("x")) {
			return false;
		}
		return true;
		/*
		 * 
		 * for(int i=0;i<str.length()-1;i++) { if (str.charAt(i)=='x' &&
		 * str.charAt(i+1)=='y') { return true; } } return false; }
		 * 
		 */

	}

	public String mixString(String a, String b) {
		// mixString("Hi", "There") → "axbycz"
		String res = "";
		int i = 0;
		for (i = 0; i < a.length(); i++) {
			res += a.charAt(i);

			res += b.charAt(i);

		}

		if (a.length() < b.length()) {
			res += b.substring(i);
		} else
			res += a.substring(i);
		return res;
	}

}
