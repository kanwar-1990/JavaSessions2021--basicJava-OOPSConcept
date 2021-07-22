package SuperKeyword;

public class LoginPage extends Page {

	public LoginPage() {

		super();// will invoke the parent class constructor
		System.out.println("LoginPage Constructo...");
	}

	int Loadtime = 50;

	public void loadingtime() {
		System.out.println("LoginPage loadtime " + Loadtime);
		System.out.println("ParentPage loadtime " + super.Loadtime);

		// super keyword is used inherit the property of parent class without creating
		// the object

		pagetitle();
		super.pagetitle();// will invoke the properties of parent clas can be applied on grand parent as
							// well
	}

	@Override
	public void pagetitle()

	{
		System.out.println("page title is.......");

	}

}
