package Javainterviewquestions;

public class CharOccurance {

	public static void main(String args[]) {

		CharOccurance c1 = new CharOccurance();
		c1.getCharSeq("i love coding", 'o');
		c1.getCharSeqpart1("i love coding", 'o');
	}

	public void getCharSeq(String s1, char value) {

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == value) {
				count++;
			}
		}
		System.out.println(" The count of char :" + value + ": mentioned is " + count);
	}

	public void getCharSeqpart1(String s1, char value) {
		int count = 0;

		for (char find : s1.toCharArray()) {
			if (find == value) {
				count++;
			}
		}
		System.out.println("The Occurance of a char in a String " + value + "" + count);
	}

}
