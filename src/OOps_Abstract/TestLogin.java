package OOps_Abstract;

public class TestLogin {
	public static void main(String[] args) {

		LoginPage l1 = new LoginPage();
		l1.title();
		l1.doLogin("Admin", "Admin123");
		l1.doLogin("Kanwar", "Kanwar124", "xyz@gmail.com");
		l1.aboutUs();
		l1.header();
		l1.loading();
		Page.logo();

		// TOP Casting

		Page p = new LoginPage();
		p.header();
		p.loading();
		p.title();
		p.title();
		Page.logo();

		// Cannot Login as below reference type check is thrown
		// l1.doLogin("Admin","Admin123");

		// DownCasting
		// It is not possible since we Cannot create Object of Abstract method or class

	}

}
