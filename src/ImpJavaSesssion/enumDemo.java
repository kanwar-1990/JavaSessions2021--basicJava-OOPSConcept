package ImpJavaSesssion;

enum mobile {
	SAMSUNG, APPLE, ONEPLUS;
	// enum by default consider the elements as final
	// In backend it creates an clss of it

}

public class enumDemo {
	public static void main(String[] args) {

		mobile m = mobile.APPLE;

		switch (m) {
		case SAMSUNG:
			System.out.println("Its an copy of Samsung");
			break;
		case APPLE:
			System.out.println("Its an Apple Phone");
			break;
		case ONEPLUS:
			System.out.println("I am competing with all");
			break;
		default:
			break;
		}

	}
}
