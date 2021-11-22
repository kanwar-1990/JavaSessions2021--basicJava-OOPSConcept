package Javainterviewquestions;

public class CountOccuranceofChar {

	public static void main(String args[]) {

		CountOccuranceofChar c1 = new CountOccuranceofChar();
		c1.charOccurance("Hello world my only friend", "o");

	}

	public void charOccurance(String s1, String ch) {

		int total_length = s1.length();

		int Count = s1.replace(ch, "").length();

		int Total_OccuranceofChar = total_length - Count;

		System.out.println("Total Occurance of the char ::" + Total_OccuranceofChar);

	}
}
