package OOPS_Inheritance;

import java.util.HashMap;
import java.util.Map;

public class FunctionalInterfacelamdaExp {
	public static void main(String[] args) {

		// Since we cannot create an object of an interface
		// but from java 8 for function interface by using lambda expression we can
		// create it
		// only applicable for functional interface
		// boiler plate code-- lot of unnecessary code-- so scala helped to do the same
		// one

		Functional f1 = () -> System.out.println("I am a functional interface");
		f1.show();

	}
}

@FunctionalInterface
// annotation used to identify interface having only one method
interface Functional {

	public void show();

}
