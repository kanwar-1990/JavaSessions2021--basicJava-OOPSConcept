package BuilderPatterns;

public class AmazonTest {

	public static void main(String[] args) {

		EcomApp App = new EcomApp();
		App.DefaultLogin().doLogin("admin", "ADMIN123").dosearch("IPhone 12").doAddtoCart("IPhone 12")
				.PaymentCheckOut("12345", "43215").logout();

		App.DefaultLogin().logout();// i just logged in and logged out
		// this is how Dev build product in the backend

		// its a violation of POM---BCZ assertion is not possible
		StringBuffer st=new StringBuffer();
         System.out.println(st.capacity())
         ;
         
	}

}
