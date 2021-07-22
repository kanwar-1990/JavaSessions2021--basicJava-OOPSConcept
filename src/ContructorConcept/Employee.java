package ContructorConcept;

public class Employee {

	String Name;// this is global variable
	int DOB;
	char Ispresent;
	String City;

	public Employee() {

		// Default constructor
	}

	public Employee(String Name)// local variable

	{
		this.Name = Name;// As soon as this keyword is used to call up the global variable
	}

	public Employee(char Ispresent, String city) {

	}

	public static void main(String[] args) {

		Employee e1 = new Employee("tom");

		// one parammetrized will be called ,however tome will be given Employee(String
		// Name)
		// Hence this keyword is used so that name as local var will will be given to
		// global varaible

		System.out.println(e1.Name);
	}

}
