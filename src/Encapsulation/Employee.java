package Encapsulation;

public class Employee {
	
	
	public String Name;
	public int dob;
	private int Salary;
	private String Address;
	
	//IF I HAVE 10-15 Private variables and methods i can use the short cut and call from source and setter and getter methods
	
	 
	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
}
