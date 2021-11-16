package Javainterviewquestions;

public class DivideByZero {

	
	public static void main(String args[])
	{
		
		// What will be  divideByZero Outcome,When done in other primitive data type
		// float,Integer,double
		//System.out.println(9 / 0);//     Gives ArthimeticException
		System.out.println(9.0 / 0); //  Infinity
		System.out.println(5.45d / 0);// Infinity
		System.out.println(6.45f / 0);// Infinity


		
		
	}
	
}
