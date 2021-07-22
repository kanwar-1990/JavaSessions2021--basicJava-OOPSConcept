package ImpJavaSesssion;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Selenium";

		// Since string is immutable , str doesnt have reverse metho
		/* as selenium will be stored in string pool and cannot be altered */

		/*
		 * int len=str.length();
		 * 
		 * String rev = "";
		 * 
		 * for (int i = len - 1; i >= 0; i--) { rev = rev + str.charAt(i);//
		 * Concatinating } System.out.println(rev);
		 */

		System.out.println(stringReverse("null"));

		// We have anothe clas which can be used to reverse a string

		// StringBuffer is mutable
		StringBuffer s4 = new StringBuffer(str);

		System.out.println(s4.reverse());

	}

	public static String stringReverse(String value) {

		// optimizing single string or null by creating condition

		int len = value.length();

		if (len == 1) {
			return value;

		}

		if (value == null) {
			return null;

		}

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + value.charAt(i);// Concatinating
		}
		return rev;

	}

}
