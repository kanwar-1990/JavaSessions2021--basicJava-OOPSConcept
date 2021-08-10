package ImpJavaSesssion;

public class UserClassInterviewQ {

	// class is an template where objects are created

	String UserName;
	int Age;
	String City;

	public static void main(String[] args) {

		UserClassInterviewQ u1 = new UserClassInterviewQ();
		u1.UserName = "kanwar";
		u1.Age = 25;
		u1.City = "Bangalore";

		UserClassInterviewQ u2 = new UserClassInterviewQ();

		u2.UserName = "kajol";
		u2.Age = 222;
		u2.City = "silchar";

		UserClassInterviewQ u3 = new UserClassInterviewQ();

		u3.UserName = "leo";
		u3.Age = 1;
		u3.City = "assam";

		System.out.println(u1.UserName + " " + u1.Age + " " + u1.City);//kanwar 25 bangalore
		System.out.println(u2.UserName + " " + u2.Age + " " + u2.City);//kajol 222 silchar
		System.out.println(u3.UserName + " " + u3.Age + " " + u3.City);// leo 1 assam

		u1 = u2;

		System.out.println(u1.UserName + " " + u1.Age + " " + u1.City);////kanwar 25 bangalore
		System.out.println(u2.UserName + " " + u2.Age + " " + u2.City);////kanwar 25 bangalore
		System.out.println(u3.UserName + " " + u3.Age + " " + u3.City);// leo 1 assam

		u2 = u3;

		System.out.println(u1.UserName + " " + u1.Age + " " + u1.City);////kanwar 25 bangalore
		System.out.println(u2.UserName + " " + u2.Age + " " + u2.City);////kanwar 25 bangalore
		System.out.println(u3.UserName + " " + u3.Age + " " + u3.City);////kanwar 25 bangalore

		u3 = u1;

		System.out.println(u1.UserName + " " + u1.Age + " " + u1.City);
		System.out.println(u2.UserName + " " + u2.Age + " " + u2.City);
		System.out.println(u3.UserName + " " + u3.Age + " " + u3.City);

	}

}
