package AdharDetails;


public class AdhardetailsImp {

	String name;
	String dob;
	char gender;
	private String adarnumber = "2296 8207 3876";
	String address;
	private int age;
	String City;
	String State;
	String Contactnum;

	public AdhardetailsImp(String name, String dob, char gender, String adarnumber, String address, int age,
			String City, String State, String Contactnum) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.adarnumber = adarnumber;
		this.address = address;
		this.age = age;
		this.City = City;
		this.State = State;
		this.Contactnum = Contactnum;

	}

	public static void main(String[] args) {

		AdhardetailsImp a = new AdhardetailsImp("Kanwar Pal Singh", "01/04/1990", 'M', "2296 8207 3876",
				"#18,10TH Cross thimmiah garden,R.T.Nagr Bng-32", 31, "Bangalore", "Karnataka", "9066549545");

		System.out.println("name : " + a.name);
		System.out.println("dob : " + a.dob);
		System.out.println("gender : " + a.gender);
		System.out.println("adharnumber : " + a.adarnumber);
		System.out.println("address : " + a.address);
		System.out.println("age :" + a.age);
		System.out.println("City : " + a.City);
		System.out.println("State : " + a.State);
		System.out.println("Contactnum : " + a.Contactnum);

	}

}
