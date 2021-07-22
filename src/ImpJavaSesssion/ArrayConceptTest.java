package ImpJavaSesssion;

import java.util.ArrayList;

public class ArrayConceptTest {

	public static void main(String[] args) {

		// This is a Raw Arraylist-- if generics are not added they wil consider by
		// default as Object

		ArrayList ar = new ArrayList();

		ar.add(100);// 0---index
		ar.add('k');// 1
		ar.add("Kanwar");// 2
		ar.add("True");// 3

		System.out.println(ar);
		System.out.println(ar.get(1));

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		for (Object e : ar) {
			System.out.println(e);
		}

		// Good Practice is to use Generics

		ArrayList<String> NameList = new ArrayList<String>();
		NameList.add("Tom");// 0
		NameList.add("Harry");// 1
		NameList.add("Potter");// 2
		NameList.add("Hello");// 3
		NameList.add("Joker");// 4

		NameList.forEach(e -> System.out.println(e));

		NameList.remove(3);

		System.out.println(NameList.get(3));// once you have removed 'Hello' , 'Joker' will be moved in this position
											// at 3 index

		// System.out.println(NameList.get(4));// IndexOutofBound

		for (int k = 0; k < NameList.size(); k++) {

			System.out.println(NameList.get(k));
		}

		for (String f : NameList) {

			System.out.println(f);
		}

		for (Object g : NameList) // We Can Use Object as its SuperClass of all the class---But its not an good
									// practice

		{

			System.out.println(g);
			if (g.equals("Potter")) {
				System.out.println("Potter is Found......");

			}
		}

	}
}
