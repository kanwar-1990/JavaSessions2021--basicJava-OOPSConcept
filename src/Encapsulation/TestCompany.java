package Encapsulation;

public class TestCompany {

	public static void main(String[] args) {
		Company c1 = new Company();// Unused ---reference variable and object

		// Since Employee Salary and Employee shares are in private this "TestCompany
		// class is not able to access it"--to get the access it we can use setter and
		// getter method

		// an external user or other class cannot access the private layer directly , we
		// can provider a public layer and with the help of it they can find desired
		// output
		// we are encapsulating the implementation in terms of private variables and method and accessing by a public layer

		Employee e1 = new Employee();
		e1.setSalary(1000);

		e1.setAddress("10th Cross thimmiah garden");

		int r = e1.getSalary();
		String s = e1.getAddress();
		System.out.println(r);
		System.out.println(s);

	
	
	
	
	
	
	
	
	
	}

}
