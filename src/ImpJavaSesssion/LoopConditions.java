package ImpJavaSesssion;

public class LoopConditions {

	public static void main(String[] args) {

		// ex--to print from 1 to 10
		// to avoid doing so much on print statement , we use loop condition
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);

		// print 1 to 10
		// in while loop we need to intialize first and while condition is used

		System.out.println("-------");

		// first intialize, then put the while conditon and then iterate it by useing
		// decre/incre value

		int i = 1;// allways intialization
		while (i <= 10)// 1 is 1 which is less than 10
		{
			System.out.println(i);// if we do no iterate it or increase the i statement,
			i++;
			// ++i;
		}
		System.out.println("------");

		int k = 0;
		while (k <= 9) {
			// System.out.println(k++); // 12345
			System.out.println("------");
			System.out.println(++k); // it will print 1 to 10, which we are not asking , hence as per the buisness
										// logic we shouldnt do this

		}

/*		// we should not do infinity loop
		while (true) {
			System.out.println("welcome to Transelvania");
		}
*/

	}

}
