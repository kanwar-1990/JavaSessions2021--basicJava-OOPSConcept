package oops_interface;

public class TestHospital {

	public static void main(String[] args) {

		FT_Hospital ft = new FT_Hospital();

		ft.cardioServices();// OverRidden from Interface
		ft.ENTServices();
		ft.DentalServices();
		ft.GynoServices();
		ft.MedicalInsurance();// from Fortis Hospital
		System.out.println(USMedicals.Med_Fee);
		ft.billing();// Default method from interface USMedicals
		ft.MedicalAssitance();// From grand Parent
		ft.CovidTest();
		ft.WorldWideMedicalReport();
		
		
		
		
		// Top Casting

		// USMedicals us=new USMedicals();====We Cannot create an object of an interface

		USMedicals us = new FT_Hospital();// every hospital is following usmedical
		us.cardioServices();
		us.GynoServices();
		us.OrthoServices();

		ft.MedicalInsurance();// U Can not acces this since parent class is referring to child class and java
								//  referance type check layer will be formed

// Down Casting// every unmedical cannot be fortis
		
		//FT_Hospital f1=new USMedicals();// We Cannot create object of interface hence down casting is also not posible
	
	
	}

}
