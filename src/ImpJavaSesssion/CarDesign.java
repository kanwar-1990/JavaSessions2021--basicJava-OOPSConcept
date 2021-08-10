package ImpJavaSesssion;

public class CarDesign {

	String Color;
	String CarName;
	int CarPrice;
	static int Wheels = 4;

	public static void main(String[] args) {
		// Practical Example of Static variable
		// Since wheels is Common Entity we have made it as Static, so that it is not
		// intialized in object everytime
		// iF MAIN METHOD IS IN DIFFERENT Class Wheels variable has to be called by
		// Class Name.wheels
		CarDesign c = new CarDesign();

		c.CarName = "BMW";
		c.Color = "blue";
		c.CarPrice = 70;

		CarDesign c1 = new CarDesign();

		c1.CarName = "audi";
		c1.Color = "white";
		c1.CarPrice = 50;

		CarDesign c2 = new CarDesign();

		c2.CarName = "honda";
		c2.Color = "Black";
		c2.CarPrice = 30;

		System.out.println(c.CarName + " " + c.Color + " " + c.CarPrice + " " + Wheels);
		System.out.println(c1.CarName + " " + c1.Color + " " + c1.CarPrice + " " + Wheels);
		System.out.println(c2.CarName + " " + c2.Color + " " + c2.CarPrice + " " + Wheels);

	}

}
