package ExceptionHandling;

public class TryCatchBloack {

	String Name;

	public static void main(String[] args) {

		System.out.println("Hi....");
		System.out.println("Hi....");
		System.out.println("Hi....");

		try {
			// if you are aware that an exception will be thrown so add the code in try
			// block
			// and once the error is thrown catch block will print it
			// And u can move to the next code
			TryCatchBloack TC = new TryCatchBloack();
			// TC = null;
			TC.Name = "tom";
			int i = 9 / 0;
			System.out.println(i);
			System.out.println("bye....");
			System.out.println("bye....");
			System.out.println("bye....");

		} catch (ArithmeticException e)

		// Exception is coming from a code
		// exception is the parent class of all the classes--like
		// arthmeticexception/nullpointer exception
		// Error--is coming from enviroment,compiler, overflow error or fatals error,
		// some crash
		// Throwable---is super class of Exception and Error Class
		// Throwable ---should be used only if ur getting an Exception with Error
		// Multiple exception can be catched by writting multiplr catch

		{
			System.out.println("Arithmetic Exception found ");
			e.printStackTrace();// this helps in printing in console the exception

		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
			e.printStackTrace();
		}

		System.out.println("hello....");
		System.out.println("hello....");
		System.out.println("hello....");

	}

}
