package WebDriverInterface;

public class GoogleTest {

	static WebDriver driver;

	public static void main(String[] args) {
		// Chromedriver driver=new Chromedriver();
		// FireFoxDriver driver=new FireFoxDriver();
		// SafariDriver driver=new SafariDriver();

		// We Cannot keep on creating multiple object of child CLass

		// We can do is top Casting
		// Which means child class is being refered by parent class reference variable,
		// downcasting cannot be done since interface and abstraction ---We Cannot
		// create an object of it
		// Seleminum doesnt want the buisness logic hence have taken up webDriver
		// interface than abstract

		String browser = "Chrome";

		if (browser.equals("Chrome")) {
			driver = new Chromedriver();
		} else if (browser.equals("FireFox")) {
			driver = new FireFoxDriver();
		} else if (browser.equals("Safari")) {
			driver = new FireFoxDriver();
		} else {
			System.out.println("Please pass the correct Browser ");
		}

		driver.getPageURL();
		driver.finElements("Name");
		driver.get("https//www.google.com");
		driver.getPageURL();

	}

}
