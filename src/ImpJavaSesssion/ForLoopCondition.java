package ImpJavaSesssion;

public class ForLoopCondition {

	public static void main(String[] args) {

		// condition 1

		for (int j = 1; j <= 10; j++)// all three is required, intialize, give the condition,and iterate it
		{
			// increment value --is not given then it will go in infinit loop

			System.out.println(j);// 1 2 3 4 5
		}

		System.out.println("-----------");

		// condition 2
		for (int j = 1; j <= 10;) {
			// increment value --is not given then it will go in infinit loop

			System.out.println(j);// 1 2 3 4 5

			j++;
		}

		/*
		 * condition 3 for (;;) {
		 * 
		 * System.out.println("hello");// output will be hello--infinte loop }
		 */

		// Condition 4
		System.out.println("----------");
		// printing a to z
		// char ---primitive DatA Type

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}
		// Condition 5
		System.out.println("----------");

		for (double d = 10.11; d <= 15; d++) {
			System.out.println(d);
		}
		// Condition 6

		boolean flag=false;
		while(flag)
		{
		System.out.println("Hello");
		}
		
		//dead code---unreachable code 
/*		while(false)
		{
			System.out.println("hi");
		}
		*/
		
		
		

	
	
	
	
	
	
	
	
	}

}
