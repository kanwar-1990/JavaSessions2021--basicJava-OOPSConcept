package OOPS_Inheritance;

//public class BMW extends Car,Truck {

public class BMW extends Car {

	@Override
	public void start()
	// Method overridding--Polymorphism--runtime mechanism---Dynamic
	// OverRidding is done as this method is there in Car class and hence preference
	// id given to BMW
	// When we have a parent class having the same method with the name and same
	// number of paramters in child class
	// is called method overriding
	{
		System.out.println("BMW----Start");
	}

	public void Autoparking() {

		System.out.println("BMW------Autoparking");
	}

	/*
	 * @Override----Static method Cannot be OverRidden in Child Class Since Static
	 * method are stored in Common Memory Hence an non static object cannot be taken
	 * hence it cannot be over ridden
	 * 
	 * public static void SunRoofing() { System.out.println("Car-----SunRoofing"); }
	 */

	// Method over Loading is possible in inherited class also---(Compile Time
	// Polymorshim)--Compile will decide what paramters need to be passed
	public void start(String Musicsystem) {
		System.out.println("Musicsystem " + Musicsystem);
	}

	public void start(String Musicsystem, String Autotune) {
		System.out.println("MusicSystem " + Musicsystem + "Autotue " + Autotune);
	}

	public void start(String Autotune, int Freq) {
		System.out.println("Autotue " + Autotune);
	}
	
	
	
	

}
