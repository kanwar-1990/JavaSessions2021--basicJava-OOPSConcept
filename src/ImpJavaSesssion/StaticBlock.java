package ImpJavaSesssion;

public class StaticBlock {

	static  {

		System.out.println("Hello i am a static block and i run once the class is loaded and before main method 1");

	}
	{
		System.out.println("i am unique  "); // this wont get executed -- we need to create an object
	}
	static {

		System.out.println("Hello i am a static block and i run once the class is loaded and before main method 2");

	}
	static {

		System.out.println("Hello i am a static block and i run once the class is loaded and before main method 3");

	}

	public static void main(String[] args) {

		StaticBlock s1 = new StaticBlock(); // As soon the object was created it gets executed

	}

}
