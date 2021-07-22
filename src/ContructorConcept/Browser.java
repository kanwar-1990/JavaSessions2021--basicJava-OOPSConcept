package ContructorConcept;

import java.util.ArrayList;

public class Browser {

	/*
	 * * browserName vendorName currentVersion List of plugins supported by Browser
	 * in Array List<String> --Design the constructor of this class with different
	 * parameters and all parameters. --Write the get method of each variable with
	 * return keyword. 
	 */

	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> plugins;

	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> plugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}

	public Browser(String browserName, double d) {
		this.browserName = browserName;
		this.currentVersion = d;
	}

	public Browser(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public static void main(String[] args) {

		Browser b1 = new Browser("Chrome", "google");
		System.out.println(b1.browserName + " " + b1.currentVersion + " " + b1.vendorName + " ");
		Browser b2 = new Browser("Chrome", 90.0);

		System.out.println(b2.browserName + " " + b2.currentVersion + " " + b2.vendorName + " " + b2.plugins);// Last 2 will give null
																												
		ArrayList<String> p = new ArrayList<String>();

		p.add("selectorHub");
		p.add("Youtube");
		p.add("gmail");

		Browser b3 = new Browser("chrome", "Google", 90.0, p);
		System.out.println(b3.browserName + " " + b3.vendorName + " " + b3.currentVersion + " " + b3.plugins.get(0));
		System.out.println(b3.browserName + " " + b3.vendorName + " " + b3.currentVersion + " " + b3.plugins.get(1));
		System.out.println(b3.browserName + " " + b3.vendorName + " " + b3.currentVersion + " " + b3.plugins.get(2));

		System.out.println(p);

	}

}
