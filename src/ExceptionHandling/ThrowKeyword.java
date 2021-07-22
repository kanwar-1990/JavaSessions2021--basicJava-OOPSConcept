package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		// throw type is created for writing own exception

		try {
			throw new Exception("I have created an own Exception--Arthimetic Exception");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
