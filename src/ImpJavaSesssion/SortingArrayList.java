package ImpJavaSesssion;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String args[]) {

		ArrayList<String> g = new ArrayList<>();
		g.add("hello");
		g.add("google");
		g.add("foul");
		g.add("violet");

		System.out.println("=======Before sorting=========");
		Collections.sort(g);
		System.out.println("Increasing sorting order: " + g);

		Collections.reverse(g);
		System.out.println("Decreasing sorting order: " + g);

		
		
	}

}
