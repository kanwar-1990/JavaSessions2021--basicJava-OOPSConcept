package ImpJavaSesssion;

public class Login {

	String UserName;
	String password;
	String title;
	String url;

	public static void main(String[] args) {

		Login GoogleLogin = new Login();// object created in heap memory global variables provided

		GoogleLogin.UserName = "admin";
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
		
	}

}
