package Javainterviewquestions;

public class ArmstrongNumber {
	// input -153---> 1 5 3 --->1*1*1 5*5*5 3*3*3 --> 1+125+127----> OutPut--->153

	public static void main(String args[]) {
		int n = 155, r;
		int sum = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;// 3//5
			n = n / 10;// 15//1
			sum = sum + r * r * r;// 0+27//0+125
		}
		if (temp == sum) {
			System.out.println("The number is Armstrong ");
		} else {
			System.out.println("The number is not Armstrong");
		}

	}
}
