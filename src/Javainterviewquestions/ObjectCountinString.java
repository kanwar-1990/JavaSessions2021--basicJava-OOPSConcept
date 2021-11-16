package Javainterviewquestions;

public class ObjectCountinString {

	public static void main(String args[]) {

		/**
		 * Written in below form or object created in the way shown below is String
		 * Literals, It will allocate memory in String constant pool s2 will also be
		 * refering to same object of s1
		 */
		String s1 = "Hello World";
		String s2 = "Hello World";// String are immutable, Since it is constant and cannot be changed
		// s2 is refering to s1 only ,no seperate object will be created
		// In a way it helps in memory managment 

		// String Object created in below format with new keyword
		// n1 will have 2 object--one created in heap memory and one in String constant
		// pool

		String n1 = new String("Hello world");

		String n2 = new String("Hello world");
		System.out.println(s2);
		System.out.println(n1);
		System.out.println(n2);

	}

}
