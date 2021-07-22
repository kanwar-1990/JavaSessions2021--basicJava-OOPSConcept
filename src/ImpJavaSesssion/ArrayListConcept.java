package ImpJavaSesssion;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		/*
		 * ArrayList id the Class Its an index based Collection Virtual Capacity--
		 * intially JVM gives 10 as allocation, and after the 10 is used by PC another 5
		 * is given we can check the same in debug method u can make arraylist as static
		 * also as we can give the allocation manually also Pysical Capacity---whens u
		 * select add method, the variable assigned starts getting added and to check
		 * the same we used size() metho
		 */
		ArrayList ar = new ArrayList();
		// ArrayList ar = new ArrayList(20);

		// After 20 allocation which is from 0-19, any value added will be considered in
		// arraylist in individual, VC will be 1 only no addition 5 or 10 allcation is
		// given

		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(900);
		ar.add(1000);
		System.out.println(ar.size());
		ar.add(1100);
		ar.add(1200);
		ar.add(1300);
		ar.add(1400);
		ar.add(1500);
		ar.add(1600);
		ar.add(1700);
		ar.add(1800);
		ar.add(1900);
		ar.add(2000);
		System.out.println(ar.size());
		ar.add(2100);
		ar.add(2200);
		System.out.println(ar.size());

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
