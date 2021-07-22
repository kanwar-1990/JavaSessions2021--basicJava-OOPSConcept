package OOps_Abstract;

public class LoginPage extends Page {

//OverRidden method
	//Static Method cannot be overRidden
	
	@Override
	public void header() {
		System.out.println("LoginPage------header");
	}

	@Override
	public void url() {
		System.out.println("LoginPage------url");

	}

	@Override
	public void title() {
		System.out.println("LoginPage------title");

	}
// Overloading Method

	public void doLogin(String usr, String PsD) {
		System.out.println("Login with Username and Password is " + usr + "" + PsD);

	}

	public void doLogin(String usr, String PsD, String Email) {
		System.out.println("login with Username ,Password and Email " + usr + "" + PsD + " " + Email);

	}

	public void aboutUs() {
		System.out.println("LoginPage----aboutUs");
	}

}
