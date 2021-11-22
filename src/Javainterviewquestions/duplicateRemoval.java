package Javainterviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;


class duplicateRemoval {
static final int i_value=10;
	public static void main(String args[]) {

		ArrayList<Integer> list = (ArrayList<Integer>)Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 2, 6, 7);
		LinkedHashSet<Integer> listset = new LinkedHashSet<Integer>(list);

		for (Integer e : listset) {
			System.out.println(e);
		}
             System.out.println(i_value);
	}

}
