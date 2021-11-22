package ImpJavaSesssion;

public class CapitalizedorNot {

	public static void main(String[] args) {

		String s1 = "KanwarPalSingh";

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
				count++;
			}

		}
		System.out.println("The count of Capitalized Char is ::" + count);

		int count1 = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isUpperCase(s1.charAt(i))) {
				count1++;
			}

		}
		System.out.println("The count of Capitalized Char is ::" + count1);

	}

}
