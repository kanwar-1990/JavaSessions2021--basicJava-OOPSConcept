package ImpJavaSesssion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Propertiesfile {

	/**
	 * demofile is created, with adding properties in key &value format it extends
	 * hastable we can retive the data on the file by using FileInputStream
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			OutputStream io = new FileOutputStream("DemoFile.properties");

			prop.setProperty("username", "knwrpl.singh@gmail.com");
			prop.setProperty("password", "Kanwar@77");
			prop.store(io, "na");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
