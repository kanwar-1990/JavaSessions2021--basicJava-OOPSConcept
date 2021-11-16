package Javainterviewquestions;

public class SwapString {

	public static void main(String... strings) {
		String s1 = "hello";
		String s2 = "World";

		System.out.println("Before swapping s1 is::" + s1);
		System.out.println("Before swapping  s2 is::" + s2);

		s1 = s1 + s2;
		System.out.println(s1);
		// helloworld

		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping s1 is::" + s1);
		System.out.println("After swapping  s2 is::" + s2);

		String s3 = "WhatsApp";
		Integer i = 10;
		System.out.println(s3 instanceof String);
		System.out.println(i instanceof Integer );
	}
}
