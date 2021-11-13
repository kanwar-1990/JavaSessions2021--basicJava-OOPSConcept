package Javainterviewquestions;

public class SumOFEleinArray {

	public static void main(String[] args) {
		int[] values = { 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		/*
		 * for(int i=0;i<=values.length-1;i++) { sum=sum+values[i]; }
		 * System.out.println("The total sum element is :"+sum);
		 */
		// enhanced for loop

		for (int value : values) {
			sum = sum + value;
		}
		System.out.println("Printing this with enhanced for loop: " + sum);
 
	}

}
