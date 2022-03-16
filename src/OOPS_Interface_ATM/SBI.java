package OOPS_Interface_ATM;

public class SBI implements ATM {

	@Override
	public void withdrawal() {

		System.out.println("You may withdraw the money");
	}

	@Override
	public void deposit(int amount) {

		System.out.println("Please enter the amount :" + amount);
		System.out.println("Amount is successfully added : " + amount);
	}

}
