package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		/*
		 * try {
		 * 
		 * int i = 9 / 0;
		 * 
		 * } finally {
		 * 
		 * System.out.println("Bye......"); }
		 */
		/*
		 * dev connects to the database db is down--exception usr /pass---Isin
		 * correct--exception Connection issue---exception
		 * 
		 * connection is done---no exception
		 * 
		 * by getting the data from the sql--exception use the data close the
		 * connection---Finally block ir respective of gettin Exception or not finally
		 * keyword will thrown as dev add, if the connection is not closed 50k users are
		 * usig it it will create unnecssary trafic or system /server break or slow
		 */
		System.out.println(getMarks("tom"));

	}

	public static int getMarks(String name) {

		if (name.equals("nicky")) {

			return 90;
		} else if (name.equals("tom")) {
			try {

				int i = 9 / 3;
				return 40;

			} catch (Exception e) {
				return 60;
			}

			finally {
				System.out.println("Allways finally block will be printed");
				return 10;

				// here we can see exception or non exception finally block is getting called
				// return is getting overridden
			}

		}

		return -1;

	}
}
