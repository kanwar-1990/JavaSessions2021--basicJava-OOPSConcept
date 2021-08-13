package Javainterviewquestions;

public class reverse {

	public static void main(String[] args) {

		reverse s2 = new reverse();
		System.out.println(s2.stringreverse("kanwar"));
	}

	public String stringreverse(String s1) {

		if (s1 == null) {
			return null;
		}
		// String s1="Kanwar"; // String are immutable--constant --are stored in
		// stringpool and values cannot be changed

		int size = s1.length();

		if (size == 1) {
			return s1;
		}

		String rev = "";// empty string

		for (int i = size - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		return rev;

	}

}
