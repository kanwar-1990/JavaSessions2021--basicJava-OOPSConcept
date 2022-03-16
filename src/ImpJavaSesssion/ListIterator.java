package ImpJavaSesssion;

import java.util.ArrayList;
import java.util.Iterator;
public class ListIterator {

	public static void main(String args[]) {
		/*
		 * .Iterator ----------------------- • Iterator is an interface which is used to
		 * traverse the list in forward direction. • Basically it provides the privilige
		 * to access the objects without using index.
		 * 
		 */
		ArrayList<String> a1 = new ArrayList<>();

		a1.add("hello");
		a1.add("hi");
		a1.add("fall");
		a1.add("google");

		Iterator<String> fo = a1.iterator();
		// object on forward direction
		System.out.println("object on forward direction");

		while (fo.hasNext()) {
			System.out.println(fo.next());
		}
		System.out.println("object on backward direction");
		// object on backward direction

	}
}
