package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		ArrayList<Object> ar2 = new ArrayList<Object>();

		//ar2.add(Integer.valueOf("hello"));
		//ar2.add(String.valueOf("hello"));

		List<Integer> ar1 = Arrays.asList(10, 20, 30, 40);

		List<Integer> he = Arrays.asList(10, 20, 30, 40);

		List ar = new ArrayList();

		// ArrayList ar = new ArrayList(20);

		// After 20 allocation which is from 0-19, any value added will be considered in
		// arraylist in individual, VC will be 1 only no addition 5 or 10 allcation is
		// given

		ar2.add(200);
		ar2.add(300);
		ar2.add(400);
		ar2.add(500);
		ar2.add(600);
		ar2.add(700);
		ar2.add(800);
		ar2.add(900);
		ar2.add(1000);
		System.out.println(ar2.size());
		ar2.add(1100);
		ar2.add(1200);
		ar2.add(1300);
		ar2.add(1400);
		ar2.add(1500);
		ar2.add(1600);
		ar2.add(1700);
		ar2.add(1800);
		ar2.add(1900);
		ar2.add(2000);
		System.out.println(ar2.size());
		ar2.add(2100);
		ar2.add(2200);
		System.out.println(ar2.size());

		for (int i = 0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}
		
	}

}
