package ImpJavaSesssion;

public class Employee {

	String Name;
	int age;
	double Salary;
	boolean IsActive;

	@Override
	public void finalize() {

		System.out.println(
				"Garbage Collector will call in Employee CLASS this finalize method before deleting the objects");
	}

	public static void main(String[] args) {

		Employee Emp = new Employee(); // new Employee --Object-- created in Heap Memory--Emp is a reference variable
										// and referening to the object
		// as soon as the object gets created , the variables photocopy is given to it.

		// it is Important that we call from the reference variable

		// Default value of boolean are false

		// I can create multiple objects and also we can create n numbers of objects

		System.out.println(Emp.Name);// default value for string is null
		System.out.println(Emp.age);// int default value is 0
		System.out.println(Emp.Salary);
		System.out.println(Emp.IsActive);// boolean default value is false

		Emp.Name = "Kanwar";
		Emp.age = 25;
		Emp.Salary = 100000;
		Emp.IsActive = true;

		System.out.println(Emp.Name + " " + Emp.age + " " + Emp.Salary + " " + Emp.IsActive + " ");

		new Employee();// you can create an object with out the reference vairable--distroyed by
						// garbage collectr
		new Employee().age = 10;// distoryed by Garbage collector

		Employee e1 = new Employee();
		e1 = null; // this will be distroyed by garbage collector
		e1.Name = "testing";

		// however in java memory mamagement---- once the memory is full in heap,
		// Garbage collector will clear or distroy all and also where they will distroy
		// an object refering null
		// objects which are not getting referenced by any variable==
		// another memory --where reference variable which is stored is stack where
		// memory management--LIFO, Last in first out
		// Java does give an option to where we can write a method and clear it--however
		// it will still check with the JVM before taking any actions

		System.gc();

	}

}
