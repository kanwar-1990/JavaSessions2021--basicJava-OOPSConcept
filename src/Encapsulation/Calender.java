package Encapsulation;

public class Calender {

	public static void main(String args[]) {
		Usercal c = new Usercal();

		System.out.println(c.toString());
		// c.monthNum=20;
		// System.out.println(c.monthNum);

	}
}

class Usercal {
	private int monthNum;// data member and variable are protected from external users from programers

}
