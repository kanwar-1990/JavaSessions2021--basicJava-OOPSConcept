package ImpJavaSesssion;

import javax.swing.Spring;

public class MethodOverLoading {

	public static void main(String[] args) {

		/*
		 * Method overloading- is also know as complie time--Polymorpsim, which means
		 * more than one types of polymorpishm is method overloading--method overriding
		 * methodoverloading can only happen in the same class with different input and
		 * different sequence and with the same name as method, is known as method
		 * overloading ex: vending Machine,UserRegistration reason for method
		 * overloading as per customer : visibilty
		 */

		MethodOverLoading m1 = new MethodOverLoading();

		m1.login("kanwar", "Admin123", 1234);
		m1.Dopayment(1246034231, 123);

	}

	// Ex:1
	public void login() {

	}

	public void login(String USR, String Password) {

	}

	public void login(String USR, String Password, int OTP) {

		System.out.println("the Correct User Name & Passwprd & OTP " + USR + " " + Password + " " + OTP);

	}

	public void login(String USR, String Password, int OTP, long PhoneNu) {

	}

	// Ex:2

	public void Dopayment() {

	}

	public void Dopayment(Spring UPI, int password) {

	}

	public void Dopayment(long CreditCNU, int cvv) {

		System.out.println("Credit Card number & CVV nu" + CreditCNU + " " + cvv);

	}

	public void Dopayment(long CreditCNU, int cvv, int OTP) {

	}

	// ex:3

	public void dosearch() {

	}

	public void dosearch(String ProductName, String ProductType) {

	}

	public void dosearch(String ProductName, String ProductType, int ProductPrice) {

	}

	public void dosearch(String ProductName, String ProductType, int ProductPrice, String ProductColor) {

	}

}
