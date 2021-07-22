package Encapsulation;

public class WebDriverTool {

	public void LaunchBrowser(String browser) {
		if (browser.equals("chrome")) {
			LaunchChromeBrowser();

		} else if (browser.equals("Firfox")) {
			LaunchFireFoxBrowser();
		} else
			System.out.println("type the correct browser");

	}

	public void LaunchChromeBrowser() {

		System.out.println("Checking Browser Compatibilty");
		System.out.println("Checking OS Version");
		System.out.println("Launch Chrome BROWSER");

	}

	public void LaunchFireFoxBrowser() {
		System.out.println("Checking Browser Compatibilty");
		System.out.println("Checking OS Version");
		System.out.println("Launch FirFox BROWSER");

	}

}
