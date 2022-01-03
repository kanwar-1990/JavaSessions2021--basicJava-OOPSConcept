package ImpJavaSesssion;

import java.util.Iterator;

public class StringManipulation {

	static String tryme = "your order number is 123464";

	public static void main(String[] args) {

		// String is nothing but collection of multiple characters

		// data is stored in terms of indexing
		// internally string maintains one char array

		String str = "This is java code i am so happy i will remember everything";
		System.out.println(str.length());

		int len = str.length();
		System.out.println(len);
		int li = 0;// lower index is 0
		int Hi = len - 1;
		System.out.println(Hi);

		System.out.println(str.charAt(3));// CHAR AT a INDEX is --s
		System.out.println(str.charAt(29));// CHAR AT a INDEX is --p

		System.out.println(str.indexOf("T"));// INDEX OF CHAR--0
		System.out.println(str.indexOf("i"));// will return the first occurance 2 2

		System.out.println(str.indexOf("i", str.indexOf("i") + 1)); // second occurance will be given --5 2
		System.out.println(str.indexOf("i", 6)); // 6

		// trim
		String s = "    Hello World         ";// This will only trim the corners and give the output
		System.out.println(s.trim());

		// Replace

		String s1 = "01-01-1990"; // need to replace - with /

		System.out.println(s1.replace('-', '/'));

		String s2 = "i love java and java loves me";

		System.out.println(s2.replace("java", "python"));

		// contains

		String s12 = "Welcome Tester";
		System.out.println(s12.contains("Tester"));// Boolean value ---true or false will be returned

		if (s12.contains("Tester")) {
			System.out.println(" Correct Mesg");

		} else {

			System.out.println("word not found");
		}

		// Concat

		String s13 = "Hello";
		String s14 = " Selenium";
		System.out.println(s13.concat(s14).concat(" whats up"));

		// Comparison

		String s3 = "i love java";
		String s4 = "i love Java";// Java is case sensitive language and space is also considered in a index

		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));// Since i have changed j to J Caps

		// substring

		String s5 = "this is my order id 12345";

		System.out.println(s5.substring(16));
		System.out.println(s5.substring(0, 10));

		// Like everysingle time id will be generate unique hence to get the string

		System.out.println(s5.substring(s5.indexOf("id") + 3, s5.length()));

		// split

		String s7 = "java;python;javascript;manjodb";

		String arr[] = s7.split(";"); /// Spilt allways return a String array
		for (String e : arr) {
			System.out.println(e);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String data = "xXtestingXxXxJavaxXselenium";

		String a[] = data.split("xX");
		System.out.println(a[0]); // this will give xX split before it is blank
		System.out.println(a[1]);
		System.out.println(a[2]);

		// Data Conversion-- IN String its a set of char Array

		// from string to int

		String d = "1000";
		System.out.println(d + 20);
		// We Can do this with Wrapper Class

		int o = Integer.parseInt(d);
		System.out.println(o + 20);

		// FROM STRING TO dOUBLE

		String f = "12.34";

		System.out.println(f + 90);// This will only be consider as Concatination

		// We will do the data conversion with Wrapper Class

		double k = Double.parseDouble(f);
		System.out.println(k + 90);

		// Can we do reverse as well--Converting int into String

		int y = 100;

		System.out.println(y + 60);

		String g = String.valueOf(y);
		System.out.println(g + 100);// Concatination Achieved

		String b = "100A";

		// int m=Integer.parseInt(b); //java.lang.NumberFormatException-- We will get

		System.out.println(b + 20);

		String v = b.substring(0, 2);

		System.out.println(v + 20);

		int h = Integer.parseInt(v);
		System.out.println(h + 20);

		//
		String s11 = "i was googling and i found you asshole what ever u do and hunt u down";

		System.out.println(s11.indexOf("a", 0));
		System.out.println(s11.indexOf("a", s11.indexOf("a", 0) + 1));// second occurance
		System.out.println(s11.indexOf("a", s11.indexOf("a", 0) + 15)); // third occurance a was found in 15th position
																		// so asked to
																		// start from there
		System.out.println(s11.indexOf("a", s11.indexOf("a", 0) + 31));// 4th occurance
		System.out.println(s11.indexOf("a", s11.indexOf("a", 0) + 41));// 5th occurance

		System.out.println(s11.indexOf("o", 0));
		System.out.println(s11.indexOf("o", s11.indexOf("o", 0) + 1));
		System.out.println(s11.indexOf("o", s11.indexOf("o", 0) + 8));// Check the conplier output of second occurance
																		// and add the value as the nect char search
																		// will start from them
		System.out.println(s11.indexOf("o", s11.indexOf("o", 0) + 22));

		String concentrate = "Hi;hello;google;uber";
		String demo[] = concentrate.split(";");
		System.out.println(demo[0]);
		System.out.println(demo[1]);
		System.out.println(demo[2]);
		System.out.println(demo[3]);

		for (String e : demo) {
			System.out.println(e);
		}

		String get = "xXhelloXxXhixxXhappy";

		String order[] = get.split("xX");

		System.out.println(order[0].length());
		for (int i = 0; i < order.length; i++) {
			System.out.println(order[i]);
		}
		String password = "admin:admin123";
		System.out.println(password.trim());
		System.out.print(password.split(":")[0] + " ");

		System.out.print(password.split(":")[1]);
		System.out.println();

		// String tryme="your order number is 123464";

		System.out.println(tryme.substring(tryme.indexOf("is") + 3, tryme.length()));
	}

}
