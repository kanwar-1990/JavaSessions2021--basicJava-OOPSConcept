package WebDriverInterface;

public interface WebDriver {

	public void get(String url);

	public void getTitle();

	public void getPageURL();

	public void finElements(String Locator);

	public void quit();

}
