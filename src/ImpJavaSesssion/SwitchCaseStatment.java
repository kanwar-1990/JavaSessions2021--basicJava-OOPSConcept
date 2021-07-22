package ImpJavaSesssion;

public class SwitchCaseStatment {

	public static void main(String[] args) {

		String browser = "OPERA";

		// switch-case is better than if and ifelse if condtion
		// it directly goes to the case which matches the key given and staifiy the
		// condtion
		// if used multiple times will --ex:100 variables are used , u need to write 100
		// cond stat and all will be checked
		// ifelseif will be challenge because the program will keep checking the
		// condition and once the given statement is satified it will come out
		// if breajk kwyword is removed it switch-case statment will be treated as if
		// else only
		// after 1/7 jdk has allowed to used int,char, string in switch-case statement
		// for float and doublw switch-case is still not allowed

		switch (browser) {
		case "chrome":
			System.out.println("launch Chrome");
			break;
		case "firfox":
			System.out.println("launch FirFox");
			break;
		case "Safari":
			System.out.println("launch Safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		default:
			System.out.println("Please type the correct browser " + browser);
			break;
		}

		int marks = 100;
		int discount = 0;

		switch (marks) {
		case 100:
			System.out.println(" GRADE A");
			discount = 1000;
			break;
		case 90:
			System.out.println(" GRADE B");
			discount = 800;
			break;
		case 80:
			System.out.println(" GRADE C");
			discount = 500;
			break;
		default:
			break;
		}
		System.out.println("THE GRADE IS " + marks + " and the discount " + discount);

	}

}
