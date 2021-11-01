package ImpJavaSesssion;

/**
 * Since multiple inheritance is challenge in java, we can call up runnable
 * imterface
 * 
 * @author knwrp
 *
 */

class hidemo implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			;

		}
	}
}

class hellodemo implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class ThreadDemoRunnable {
	public static void main(String... args) throws Exception {
		hidemo h = new hidemo();
		hellodemo he = new hellodemo();

		Thread t1 = new Thread(h);
		Thread t2 = new Thread(he);

		t1.setName("hi Thread");
		t2.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		Thread.sleep(10);
		t2.start();

	}

}
