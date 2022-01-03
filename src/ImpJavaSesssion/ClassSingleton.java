package ImpJavaSesssion;

public class ClassSingleton {
	/*
	 * in OOps,Singleton class can have one object or instance of a class at a time
	 * how to design Singleton class make constructor as private Create an public
	 * static method( getInstance) which can have the instance of the Singleton
	 * class(Also,Known as lazy Intialization)
	 * 
	 */

	private static ClassSingleton singletone_instance = null;

	public String s1;

	private ClassSingleton() {
		s1 = "i have Coding to be done daily";
	}

	// lazy Intialization

	public static ClassSingleton getInstance() {
		if (singletone_instance == null) {
			singletone_instance = new ClassSingleton();
		}
		return singletone_instance;
	}

	public static void main(String args[]) {

		singletone_instance = ClassSingleton.getInstance();
		String s2 = singletone_instance.s1.toUpperCase();
		String s3 = singletone_instance.s1.toUpperCase();
		String s4 = singletone_instance.s1.toUpperCase();

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}
}
