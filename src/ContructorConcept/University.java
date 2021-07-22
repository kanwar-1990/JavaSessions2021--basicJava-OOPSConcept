package ContructorConcept;

import java.util.ArrayList;

public class University {

	String name;
	String Country;
	int StatablizedDate;
	ArrayList<String> Courses;

	// After Defining Variables we need to right click and select source in that
	// constructor option will be there and will select what ever the variable we
	// need and create constructor
	// Name of the constructor is same as the class
	// It Looks like a function but its not a function
	// Const will never return any value : No return type
	// function may or may not return a value
	// its not about the memory -- it will take similar to function, however this is
	// helps in time consuptions

	public University(String name, String country, int statablizedDate) {
		this.name = name;
		Country = country;
		StatablizedDate = statablizedDate;
	}

	public University(String name, String country) {
		this.name = name;
		Country = country;
	}

	public University(String name, String country, int statablizedDate, ArrayList<String> courses) {
		super();
		this.name = name;
		Country = country;
		StatablizedDate = statablizedDate;
		Courses = courses;
	}

	public static void main(String[] args) {

		University u1 = new University("Liza", "Britan");

		System.out.println(u1.name + " " + u1.Country);

		University u2 = new University("tom", "austraila", 30);

		System.out.println(u2.name + " " + u2.Country + " " + u2.StatablizedDate);

		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Automation Course");
		a1.add("Java");
		a1.add("c");
		a1.add("manual");

		// Below are the details where someone needs the course details as well
		University u3 = new University("kite", "japan", 1, a1);

		System.out.println(u3.name + " " + u3.Country + " " + u3.StatablizedDate + " " + u3.Courses.get(0));

		System.out.println(u3.name + " " + u3.Country + " " + u3.StatablizedDate + " " + a1.get(1));
		System.out.println(u3.name + " " + u3.Country + " " + u3.StatablizedDate + " " + a1.get(2));
		System.out.println(u3.name + " " + u3.Country + " " + u3.StatablizedDate + " " + a1.get(3));

		ArrayList<String> i = u3.Courses;
		System.out.println(i);

	}

}
