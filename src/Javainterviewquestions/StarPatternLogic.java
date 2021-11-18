package Javainterviewquestions;

public class StarPatternLogic {
	
	
	public static void main(String args[])
	{
		/*
		 * 
		 ** 
		 ***
		 ****
		 ***** 
		 * logic stands that we need to fill this will a table,column can be j and row
		 * can be i
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	System.out.println();
		/*
		*****
		****
		***
		**
		*				
		logic stands that we need to fill this will a table,column can be j and row can be i 
		*/	
	
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
