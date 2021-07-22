package ImpJavaSesssion;

public class finalizeConcept {

	public static void main(String[] args) {
		finalizeConcept obj = new finalizeConcept();
		obj = null;// Obj is pointing to null, which means no reference variable is refering to it
		// All the classes by default are child classes of the object class
		System.gc();// Programitcally we are calling grbage collector====gc will clean the objects
					// which doesnt have reference value or null reference . And will also check if
					// any finalize method is created or not and it will call the finalize method
					// and then clean it
		Employee e1 = new Employee();
		e1 = null;
		System.out.println("bye.......");

	}

	@Override
	public void finalize() {

		System.out.println("Garbage Collector will call this finalize method before deleting the objects");
	}

}
