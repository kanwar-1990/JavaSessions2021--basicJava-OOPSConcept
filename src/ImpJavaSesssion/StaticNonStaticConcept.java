package ImpJavaSesssion;

public class StaticNonStaticConcept {

	static String Name;
	int age;

	static public void getName() {
		System.out.println("**********Get Name***********");
	}

	public void GetText() {
		System.out.println("**********GetText************");
	}

	public static void main(String[] args) {
		// Static method and variable---Are stored in seperate memory (Permanent Generation) in Comman memory
		// location--can be called by class name or directly
		// Non Static method and variable--are called by creating a object only,

		// 1. Calling a non non static method and static variable ---Is only by creating
		// an Object

		StaticNonStaticConcept SN = new StaticNonStaticConcept();
		System.out.println(SN.age = 25);
		SN.GetText();

		// 2.Calling a static method and variable ---Directly or By Class Name
		// Calling them directly
		System.out.println(Name = "Kanwar");
		getName();

		// Calling by Class Name
		System.out.println(StaticNonStaticConcept.Name = "Singh");

		StaticNonStaticConcept.getName();

		// Can use Obj to call Static Variable and static method
		SN.Name = "Wrong Way of calling --you still will be able tp see them as they are Common memory";

	}

}
