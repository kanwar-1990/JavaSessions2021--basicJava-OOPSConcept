package ImpJavaSesssion;

import java.util.ArrayList;

public class ArrayAssignment {

	public static void main(String[] args) {

		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection

		ArrayList<String> Colour = new ArrayList<String>();

		Colour.add("White");
		Colour.add("Yellow");
		Colour.add("Red");
		Colour.add("Blue");

		for (int i = 0; i < Colour.size(); i++) {

			System.out.println(Colour.get(i));

		}

		// 2. Write a Java program to insert an element into the array list at the first
		// and last positions
		// 3. Write a Java program to retrieve an element (at a specified index) from a
		// given array list.

		ArrayList<String> FiLa = new ArrayList<String>();

		FiLa.add("Hello");
		FiLa.add("Hi");
		FiLa.add("First");
		FiLa.add("Last");

		FiLa.add(0, "Bye");
		FiLa.add(3, "Crap");

		System.out.println("The First Element is " + FiLa.get(0));
		System.out.println("The Last Element is " + FiLa.get(3));

		// 4. Write a Java program to update specific array element by given element

		ArrayList<String> Tutor = new ArrayList<String>();

		Tutor.add("Mukesh");
		Tutor.add("Ramesh");
		Tutor.add("Pranesh");

		Tutor.add(1, "Harpreet");

		System.out.println("The Replaced Element is " + Tutor.get(1));

		// 5. Write a Java program to remove the third element from a array list.

		ArrayList<String> Rem = new ArrayList<String>();

		Rem.add("tom");// 0
		Rem.add("Jerry");// 1
		Rem.add("feb");
		Rem.add("July");
		Rem.add("june");

		Rem.remove(3);

		for (String e : Rem) {
			System.out.println(e);
		}

		// 6. Write a Java program to search an element in a array list.

		ArrayList<String> Gup = new ArrayList<String>();

		Gup.add("jan");
		Gup.add("feb");
		Gup.add("march");
		Gup.add("April");
		Gup.add("may");

		System.out.println("March is Available " + Gup.contains("march"));

		// 7. Write a Java program to reverse elements in a array list

		ArrayList<String> days = new ArrayList<String>();

		days.add("mon");// 0
		days.add("tue");// 1
		days.add("wed");
		days.add("thurs");
		days.add("fri");

		for (int i = days.size() - 1; i > 0; i--) {
			System.out.println(days.get(i));
		}

		// 8. Write a Java program to extract a portion of a array list.

		ArrayList<String> days1 = new ArrayList<String>();

		days1.add("mon");// 0
		days1.add("tue");// 1
		days1.add("wed");
		days1.add("thurs");
		days1.add("fri");

		// it will only give 0,1 so ad 3
		System.out.println("The Sublist from 0 to2 is " + days1.subList(0, 3));

		// 9. Write a Java program of swap two elements in an array list.

		ArrayList<Integer> swaping = new ArrayList<Integer>();

		swaping.add(10);
		swaping.add(20);

		System.out.println("before swaping  " + swaping);
		// set method for swaping
		swaping.set(0, 20);
		swaping.set(1, 10);

		System.out.println("After swaping   " + swaping);

		// 10. Write a Java program to empty an array list.

		ArrayList<String> Count = new ArrayList<String>();

		Count.add("India");
		Count.add("austraila");
		Count.add("Sri Lanka");
		Count.add("Maal");

		Count.removeAll(Count);

		// 11.Write a Java program to trim the virtual capacity of an array list the
		// current list size.

		ArrayList<Integer> Inp = new ArrayList<Integer>();

		Inp.add(100);
		Inp.add(200);
		Inp.add(300);

		Inp.trimToSize();// trimming the virtual capacity -- dc=10, and 3 is used, remaining 7 is trimmed

		// 12. Write a Java program to print all the elements of a ArrayList using the
		// position of the elements

		ArrayList<Integer> Inp1 = new ArrayList<Integer>();

		Inp1.add(100);
		Inp1.add(200);
		Inp1.add(300);
		Inp1.add(400);
		Inp1.add(500);

		System.out.println(Inp1.get(0));
		System.out.println(Inp1.get(1));
		System.out.println(Inp1.get(2));
		System.out.println(Inp1.get(3));
		System.out.println(Inp1.get(4));

	}

	// a,e,i,o,u

}
