package ImpJavaSesssion;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the value :");
		String line = scanner.nextLine();
		System.out.println(line);
	}

}
