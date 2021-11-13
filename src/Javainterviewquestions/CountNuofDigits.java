package Javainterviewquestions;

public class CountNuofDigits {

	public static void main(String... args) {

		int value=getTheDigitCount(1358977);
		System.out.println("The value is :"+value);
  	
	}

	public static int getTheDigitCount(int value) {

		int count = 0;

		while (value > 0) {
			value = value / 10;
			count++;

		}
		return count;

	}

}
