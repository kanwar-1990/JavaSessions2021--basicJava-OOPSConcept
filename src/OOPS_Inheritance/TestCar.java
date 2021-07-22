package OOPS_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW B1 = new BMW();// After creating an object i am called BMW ,SINCE Bmw is a child class of car,
							// i will be able to use the methods in Car
		B1.start();
		B1.refueling();
		B1.Stop();
		System.out.println(B1.i);
		B1.Autoparking();
		//B1.SunRoofing(); --Static method cannot be over ridden hence not calling them
		B1.Engine();//GrandFather Class
		B1.start("BOSCH");
		B1.start("Radio",92);
		B1.start("BOSCH","Radio"
				+ "");

		Car c = new Car();

		c.start();
		c.Stop();
		c.refueling();
		// c.Autoparking();--parent cannot imheritance child method hence Autoparking()
		// cannot be called

		// Top Casting

		// Where Car(Parent Class) reference variable is given to BMW (Child Class)
		Car c1 = new BMW();/// new BMW---IS THE OBJECT AND c1 is refering to it--BMW is a Car,Top Casting
		c1.start();
		c1.refueling();
		c1.Stop();
		B1.Engine();//Grandfather--Class
		// Still we cannot get the method as Autoparking //c1.Autoparking()--java will
		// create reference type check layer over and will not allow to take up
		// Autoparking method

		// down Casting--Is not possible

		/*
		 * BMW B3 = (BMW) new Car();// This called as conversion--i am convertion car to
		 * BMW B3.start(); // java.lang.ClassCastException--AT run time it will give
		 * this expection, we // cannot convert Car into BMW, Since not all cars can be
		 * BMW, iT
		 * 
		 * Another Exmp--We can look and feel to a maruti 800, but that doesnt mean it
		 * can be BMW
		 */
	}

}
