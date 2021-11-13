package ImpJavaSesssion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class duplicateArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<>();

		obj.add(5);
		obj.add(7);
		obj.add(6);
		obj.add(6);

		for (Integer i : obj) {
			System.out.println(i);
			// ArrayList will print the duplicate elements

		}

		Set<Integer> obj1 = new HashSet<Integer>();
		// Set doesnt allow duplicate value
		for (Integer i : obj) {
			if (obj1.add(i) == false)
				System.out.println(obj1);

		}

	}
}
