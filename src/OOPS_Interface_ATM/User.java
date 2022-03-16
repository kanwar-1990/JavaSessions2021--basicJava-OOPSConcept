package OOPS_Interface_ATM;

public class User {

	/**
	 * 
	 * Why Multiple inheritance is possible through interface?
      A.
 • A class cannot extend more than one class but it can implements
 multiple interfaces.
 • In interafce there is no possibility of Ambiguity problem because even
 though multiple interfaces contains same method name but
 implementation will be given only once because in interface class
 gives implementation and it won't implement multiple methods with
 same name and same argument in single class
	 */
/*	
Specialisation 
--------------- 
The process of developing a method which handles only one type of object 
such methods are called as special methods and process is called as 
specialisation.
*/	
	public static void main(String args[]) {

		SBI s = new SBI();
		s.deposit(5000);
		s.withdrawal();

	}

}
