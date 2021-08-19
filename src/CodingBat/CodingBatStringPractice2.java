package CodingBat;

public class CodingBatStringPractice2 {

	public static void main(String[] args) {
		System.out.println(endsLy("oddy"));
		System.out.println(nTwice("chocolate", 3));
		System.out.println(twoChar("java", 0));
		System.out.println(middleThree("Candy"));
		System.out.println(hasBad("xxxbadxx"));
		System.out.println(atFirst(""));
	System.out.println(lastChars("last", ""));
	
	
	}

	public static boolean endsLy(String str) {
		/*
		 * endsLy("oddly") → true endsLy("y") → false endsLy("oddy") → false
		 */

		if (str.endsWith("ly")) {
			return true;
		} else
			return false;

	}

	public static String nTwice(String str, int n) {
		// nTwice("Hello", 2) → "Helo"
		// nTwice("Chocolate", 3) → "Choate"
		// nTwice("Chocolate", 1) → "Ce"

		return str.substring(0, n) + str.substring(str.length() - n);

	}

	public static String twoChar(String str, int index) {
		/*
		 * twoChar("java", 0) → "ja" twoChar("java", 2) → "va"
		 */
		if (str.length() == 0 || str.length() <= 2) {
			return str.substring(0, 2);
		} else
			return str.substring(str.length() - 2, str.length());
	}

	public static String middleThree(String str) {
		// middleThree("Candy") → "and"
		int ha = str.length() / 2;
		return str.substring(ha - 1, ha + 2);
	}

	public static boolean hasBad(String str) {
		/*
		 * hasBad("badxx") → true hasBad("xbadxx") → true hasBad("xxbadxx") → false
		 */

		if (str.startsWith("ba")) {
			return true;
		}

		else if (str.subSequence(0, 3).equals("bad")) {
			return true;
		} else if (str.subSequence(1, 4).equals("bad")) {
			return true;
		}
		return false;
	}

	public static String atFirst(String str) {
		/*
		 * atFirst("hello") → "he" atFirst("hi") → "hi" atFirst("h") → "h@"
		 * 
		 */
		if (str.length() >= 2) {
			return str.substring(0, 2);

		} else if (str.isEmpty()) {
			return "@@";
		}

		else {

			return str + "@";
		}
	}

	public static String lastChars(String a, String b) {
		/*
		lastChars("last", "chars") → "ls"
lastChars("hi", "") → "h@"

		*/   if (b.isEmpty()) {
			return a.substring(0,1)+"@";
		}
		else if (a.isEmpty()) {
			return b.substring(b.length()-1,b.length())+"@";
		}else
                return a.substring(0,1)+b.substring(b.length()-1,b.length());
	
	
	}



















}
