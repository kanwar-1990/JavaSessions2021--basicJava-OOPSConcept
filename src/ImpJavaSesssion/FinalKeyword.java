package ImpJavaSesssion;

public class FinalKeyword {

	public static void main(String[] args) {

		final int days = 7;

		// days=10; //Cannot change it since its declared final
		// final --Cannot be overridden and neither can be inherited by child class

		int TotalIncome = days * 10;
		System.out.println(TotalIncome);

	}

}
