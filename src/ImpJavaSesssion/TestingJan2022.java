package ImpJavaSesssion;

public class TestingJan2022 {

	String employeeName;
	int age;
	String dob;

	public static void main(String args[]) {

		TestingJan2022 e1 = new TestingJan2022();
		e1.employeeName = "kanwar";
		e1.age = 32;
		e1.dob = "02/07/1990";
		System.out.println(e1.employeeName + " " + e1.age + " " + e1.dob);
		TestingJan2022 e2 = new TestingJan2022();
          e2=e1;
  		System.out.println(e2.employeeName="hero" + " " + e2.age + " " + e2.dob);
      	
	
	}

}
