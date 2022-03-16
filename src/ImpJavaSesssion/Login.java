package ImpJavaSesssion;

public class Login {

	// static variables will be added in String pool area which is part of heap
	// class loader is responsible to load static member
	// static member will only get added once in static pool area

	static {
		System.out.println("i will get loaded first");
	}

	static String UserName; // class level variable declaration --global variables
	String password;
	String title;
	String url;

	public static void main(String[] args) {

		Login GoogleLogin = new Login();// object created in heap memory global variables provided

		Login.UserName = "admin";
		GoogleLogin.password = "admin123";
		GoogleLogin.title = "google";
		GoogleLogin.url = "http://www.google.com";

		System.out.println(GoogleLogin.UserName);
		System.out.println(GoogleLogin.password);
		System.out.println(GoogleLogin.title);
		System.out.println(GoogleLogin.url);

		Login AmazonLogin = new Login();

		AmazonLogin.UserName = "Sachin";
		AmazonLogin.password = "Sachin@123";
		AmazonLogin.title = "Amazon";
		AmazonLogin.url = "http://www.amazon.in";

		new Login();/// Will be distoryed by garbage collector
		System.gc(); // for garbage collection by Manaully-Jvm

	}

}
