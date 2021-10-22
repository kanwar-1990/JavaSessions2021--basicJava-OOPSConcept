package Javainterviewquestions;

public class Fibnoacci {

	public static void main(String... args) {
		// 1 1 2 3 5 8 13 21..
		int k = 0, i = 1, j = 1;
		System.out.print("1 1 ");
		while (k <= 50) {
			k = i + j;
			if (k > 50)
				break;
			System.out.print(k + " ");
			i = j;
			j = k;
		}

	}
}
