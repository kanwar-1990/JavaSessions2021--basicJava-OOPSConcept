package OOPS_Inheritance;

public class Car extends Vehicles {

	// marker interface ,doesnt have any method declaration,however can be used to
	// provide permission
	// ex==cloneable,serializable
	// we can use instanceof keyword

	public int i = 10;

	/*
	 * public final void start() // final keyword will be used--to make sure that
	 * overridding cannot be done Also we Cannot add final keyword--It cannot be
	 * inherited by Child class
	 * 
	 * { System.out.println("Car----Start"); }
	 */

	public void start()

	{
		System.out.println("Car----Start");

	}

	public void refueling()

	{

		System.out.println("Car----refueling");

	}

	public void Stop()

	{
		System.out.println("Car----Stop");
	}

	public static void SunRoofing() {
		System.out.println("Car-----SunRoofing");
	}

}
