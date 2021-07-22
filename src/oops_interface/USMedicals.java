package oops_interface;

public interface USMedicals extends WHO{

	public int Med_Fee = 10;

	// Interface cannot have method body
	// Only Method prototype
	// Only Method Declariation
	// Cannot create an object of interface
	// Variables declared in interfaces are by default static and final
	public void GynoServices();

	public void OrthoServices();

	public void cardioServices();
	
	public void DoctorsCount(int Count);

	// After jdk 1.8 two changes has been done

	// Static method can be declared with a body
	// Default method can be created in interface, however cannot be overridden in
	// other class, we can change it to public and use it

	public static void HospitalAdmin() {
		System.out.println("USMedicals---HospitalAdmin");
	}

	default void billing() {
		System.out.println("USMedicals---Default");
	}
}
