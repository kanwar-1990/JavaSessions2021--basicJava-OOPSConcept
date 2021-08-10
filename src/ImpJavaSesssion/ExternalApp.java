package ImpJavaSesssion;


public class ExternalApp {

	public static void main(String[] args) throws Exception {

		Runtime r = Runtime.getRuntime();

		// r.exec("notepad.exe");

		// r.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		String[] s1 = new String[] { "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",
				"https://app.box.com/notes/558765504000" };
		r.exec(s1);

	}

}
