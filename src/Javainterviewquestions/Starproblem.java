package Javainterviewquestions;

public class Starproblem {
/*
             code 1
****
****
****	
****	

             code 2
*
**
***
****
*****	
	
*/	
	
	public static void main(String args[]) {
		for (int j = 0; j <= 5; j++) {
			for (int i = 0; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************************************");

		for (int f = 0; f <= 5; f++) {

			for (int k = 0; k < f; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	
	}
}
