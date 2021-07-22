package BuilderPatterns;

public class EcomApp {

	// if object is created in the class itself we can directly call them and that to in abridge format
	// return this; and void needs to be change to class name----this process is called builderPatterns
	
	
	public EcomApp DefaultLogin() {

		System.out.println("Login With Default UserName and Password ");
		return this;
	}

	public EcomApp doLogin(String USR, String Pass) {

		System.out.println("Enter UserN and Password ");
		return this;

	}

	public EcomApp dosearch(String ProductName) {

		System.out.println("Do a Product Search " + ProductName);
		return this;

	}

	public EcomApp dosearch(String ProductName, int Price) {

		System.out.println("Do a Product Search " + ProductName + "And Price" + Price);
		return this;

	}

	public EcomApp doAddtoCart(String ProductName) {

		System.out.println("Add to Selected product to Cart" + ProductName);
		return this;

	}

	public EcomApp PaymentCheckOut(String ACCNU, String Pass) {

		System.out.println("Add Account number and Pass" + ACCNU + " " + Pass);
		return this;

	}

	public EcomApp Orderid(int orderID) {
		System.out.println("Order ID of the product booked is " + orderID);

		return this;

	}

	public EcomApp logout() {

		System.out.println("Thanks for Shopping WithUs ,You Have been LoggedoUT");
		return this;

	}

}
