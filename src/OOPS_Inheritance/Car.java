package OOPS_Inheritance;

public class Car extends Vehicles {

	// marker interface ,doesnt have any method declaration,however can be used to
	// provide permission
	// ex==cloneable,serializable
	// we can use instanceof keyword
	
	/**
* Only Non static methods can be inherited, static methods cannot
    be inherited because they will get loaded only once in SAP.
  Constructors cannot be inherited because they are not a member 
 of class,they are just used to initialise a Non static variable.
  If we create Object of super class, we can access only super 
 class methods.
  If we create Object of sub class, we can access both super and 
 sub class properties.
 */

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
