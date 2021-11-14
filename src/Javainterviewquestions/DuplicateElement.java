package Javainterviewquestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String... args) {
		// the outcome is o(n*n)
		String a[] = { "java", "hello", "c#", "c++", "javascript", "ruby", "java" };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					System.out.println("The duplicate value is :" + a[i]);
				}

			}
		}

		// using hashset

		Set<String> setvalue = new HashSet<String>();

		for (String name : a) {

			if (setvalue.add(name) == false) {
				System.out.println("The duplicate value is :" + name);
			}
		}

	}
}
