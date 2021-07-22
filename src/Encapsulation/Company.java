package Encapsulation;

public class Company {

	public String EmpName;
	public int EMPcount;
	private int EmpSalary;

	public String CEOName() {
		return "Tom";
	}

	private int EmpShares() {
		return 1000;
	}

	// Access modifer ---private can we called with in the class ,however to access
	// outside the class maybe from a different classs
	// a public layer needs to be used ---which encapsulation ----data hiding or
	// data security

public static void main(String[] args) {

		Company c = new Company();
		c.EmpName = "Sachin";
		c.EMPcount = 50;
		c.CEOName();
		System.out.println(c.EmpName + " " + c.EMPcount + " " + c.CEOName());

		// Private values and methods

		int a = c.EmpSalary = 50000;
		System.out.println(a);
		System.out.println(c.EmpShares());

	}

}
