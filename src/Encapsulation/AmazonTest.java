package Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {

		WebDriverTool driver = new WebDriverTool();

		driver.LaunchBrowser("chrome");
		/*
		 * theser are visible to other class and we dont want implemention to be seen by
		 * external class or userdriver.LaunchChromeBrowser();
		 * driver.LaunchFireFoxBrowser();...hence we will make them private
		 */

	}

}
