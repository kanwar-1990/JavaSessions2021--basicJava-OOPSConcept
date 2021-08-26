
package CodingBat;

public class CodingBatStringPractice8 {

	public static void main(String arg[]) {
		CodingBatStringPractice8 cb = new CodingBatStringPractice8();
		System.out.println(cb.repeatEnd("Hello", 3));
		System.out.println(cb.repeatFront("Chocolate", 3));
	System.out.println(cb.repeatSeparator("This","And", 2));
	
	}

	public String repeatEnd(String str, int n) {

		// repeatEnd("Hello", 3) → "llollollo"

		String re = "";
		for (int i = 0; i < n; i++) {
			// for repeating the loop 3 times

			re += str.substring(str.length() - n, str.length());
		}
		return re;
	}

	public String repeatFront(String str, int n) {
		// repeatFront("Chocolate", 4) → "ChocChoChC"

		String rf = "";
		for (int i = n; n > 0; n--) {
			rf += str.substring(0, n);
		}
		return rf;
	}

	public String repeatSeparator(String word, String sep, int count) {
		// repeatSeparator("Word", "X", 3) → "WordXWordXWord"
	
			String Sepr = "";
	
			for (int i = 0; i <count; i++) {
				Sepr += word + sep;
			}
			return Sepr.substring(0,Sepr.length()-sep.length());
	//ThisAndThis-And
	}

}
