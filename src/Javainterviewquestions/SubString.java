package Javainterviewquestions;

public class SubString {

	public static void main(String args[]) {

		SubString s1 = new SubString();
		s1.subString("Hello world whats the matter", "matter");

	}

	public boolean subString(String main, String subString) {
		return main.matches("(.x)" + subString + "(.x)");
	}

}
