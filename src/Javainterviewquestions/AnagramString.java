package Javainterviewquestions;

import java.util.Arrays;

public class AnagramString {

	// input-->CAT,output-->ACT

	public static void main(String[] args) {

		anaGramString("CAT", "ACT");
		anaGramString("Listen", "Silent");
	}

	public static boolean anaGramString(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		s1.replaceAll("//s", " ");
		s2.replaceAll("//s", " ");
		char[] s11 = s1.toCharArray();
		char[] s12 = s2.toCharArray();
		Arrays.sort(s11);
		Arrays.sort(s12);
		return Arrays.equals(s11, s12);

	}

}
