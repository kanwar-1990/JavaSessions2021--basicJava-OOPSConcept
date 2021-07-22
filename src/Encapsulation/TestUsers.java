package Encapsulation;

public class TestUsers {

	public static void main(String[] args) {

		// Using accessing them
		Users u1 = new Users();
		u1.name = "zoela";
		u1.age = 15;
		u1.userID = 12345;
		System.out.println(u1.name + " " + u1.age + " " + u1.userID);

		// Using constructor----Majorly Used

		Users u2 = new Users("tom", 16, 14352);

		System.out.println(u2.name + " " + u2.age + " " + u2.userID);

		// Using Setter and getter

		Users u3 = new Users();
		u3.setAge(18);
		u3.setName("masa");
		u3.setUserID(15489);

		System.out.println(u3.getName() + " " + u3.age + " " + u3.userID);

	}

}
