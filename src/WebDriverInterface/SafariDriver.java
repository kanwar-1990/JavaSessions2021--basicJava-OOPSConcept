package WebDriverInterface;

public class SafariDriver implements WebDriver{
	SafariDriver() {
		System.out.println("Launch SafariDriver...............");
	}

	@Override
	public void get(String url) {
		System.out.println("URL IS =====>" + url);

	}

	@Override
	public void getTitle() {
		System.out.println("GET ME THE TITLE ");

	}

	@Override
	public void getPageURL() {
		System.out.println("Get THE PAGE URL");

	}

	@Override
	public void finElements(String Locator) {

		System.out.println("Locator found is=======> " + Locator);
	}

	@Override
	public void quit() {
		System.out.println("Quit the URL");

	}


	
	
	
	
}
