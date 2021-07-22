package oops_interface;

public class FT_Hospital extends MedicalAssitanceq implements USMedicals, UkMedicals, IndiaMedicals

{

	@Override // As the Method overLoading
	public void NeuroServices() {
		System.out.println("FT----NeuroServices");
	}

	@Override
	public void DentalServices() {
		System.out.println("FT----DentalServices");

	}

	@Override
	public void onclogyServices() {
		System.out.println("FT----onclogyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FT----pediaServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FT----ENTServices");

	}

	@Override
	public void GynoServices() {
		System.out.println("FT----DentalServices");

	}

	@Override
	public void OrthoServices() {
		System.out.println("FT----OrthoServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FT----cardioServices");

	}

	public void MedicalInsurance() {
		System.out.println("FT----MedicalInsurance");

	}

	public void PathologyServices() {
		System.out.println("FT----PathologyServices");

	}
	/*
	 * @Override --logic Still remains the same we cannot override the static method
	 * public static void HospitalAdmin() {
	 * System.out.println("USMedicals---HospitalAdmin"); }
	 */

	@Override
	public void DoctorsCount(int Count) {

		System.out.println("Total WorldWide Doc Count" + Count);
	}

	@Override
	public void WorldWideMedicalReport() {
		System.out.println("FT--WorldWideMedicalReport");

	}

	@Override
	public void CovidTest() {

		System.out.println("FT--Covid Test");

	}

}
