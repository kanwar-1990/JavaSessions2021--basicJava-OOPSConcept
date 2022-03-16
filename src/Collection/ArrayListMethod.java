package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {

		ArrayList<String> EmpList = new ArrayList<String>();

		EmpList.add("A");
		EmpList.add("B");
		EmpList.add("C");
		EmpList.add("D");

		System.out.println(EmpList);
		System.out.println(EmpList.size());

		EmpList.clear(); // It will help in clearing the added list ,however that doesnt mean it will
							// delete it
		System.out.println(EmpList.size());

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("A");
		ar.add("B");
		ar.add("C");
		ar.add("D");
		ar.add("X");

		ar.stream().forEach(ele->System.out.println(ele));

		// We Can also clone this or create an duplicate ArrayList

		System.out.println(ar.clone());
		// NOW we need to store in a different ArrayList

		// We need to type cast it as it will give a Copy of the List--Shallow Copy

		ArrayList<String> ar1 = (ArrayList<String>) ar.clone();

		System.out.println(ar1);

		// contains method

		System.out.println(ar.contains("B"));
		System.out.println(ar.contains("N"));

		// IndexOf

		System.out.println(ar.indexOf("B"));

		ArrayList<String> Name = new ArrayList<String>(2);

		Name.add("Tom");
		Name.add("hELP");

		System.out.println(Name);

		// if i have given 2 as the number of VC which we can use and then i want more
		// VC to use we can use ensurecapacity method
		// vc by default is given as 10 and then after completion JVM will give another
		// 5 and this goes on
		// JVM ---allways focus on memory management

		Name.ensureCapacity(3);

		// for Each Loop-----after JDK 1.8 it was added with lambda

		// typical for loop and for each loop

		ar.forEach(e -> System.out.println(e));

		// foreach loop we have used to put the content in lower case
		ar.forEach(f -> System.out.println(f.toLowerCase()));

		// Sorting in ArrayList

		ArrayList<String> EmpName = new ArrayList<String>();

		EmpName.add("kanwar"); // 0
		EmpName.add("leo"); // 1
		EmpName.add("nardo"); // 2
		EmpName.add("ales"); // 3
        
		System.out.println(EmpName);
		
		// Sorting----in Collections
		Collections.sort(EmpName);
		System.out.println(EmpName);
 
		//reverse sorting
	
	    Collections.sort(EmpName,Collections.reverseOrder()); 
	
	}

}
