package OOPS_Inheritance;

// In a single class only one public class can be there 
class Rbi {
	public void rateOfInterest() {
		System.out.println("Rate to be 6.75%");
	}
}

class Sbi extends Rbi {
	public static void tenure() {
		System.out.println("Tenurity for 3 years");
	}

}

public class OpenAccount extends Sbi {
	public static void main(String args[]) {
		Sbi s = new Sbi();
		s.rateOfInterest();
		s.tenure();
	}
}
