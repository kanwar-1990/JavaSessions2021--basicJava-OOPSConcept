package ImpJavaSesssion;

//to overcome the challenge of multiple inheritance ,we use interface runnable

class hi extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}

	}
}

class hello extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}
	}
}

public class ThreadDemo {

	public static void main(String args[]) {
		hi h = new hi();
		hello he = new hello();

		h.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}

		he.start();

	}

}
