package OOPS_Inheritance;

public class FunctionalInterfacelamdaExp {
	public static void main(String[] args) {
		
	
	Functional f1=()->System.out.println("I am a functional interface");
	f1.show();
	
	}
	}

@FunctionalInterface
// annotation used to identify interface having only one method
interface Functional{
	
	public void show();
	
}
