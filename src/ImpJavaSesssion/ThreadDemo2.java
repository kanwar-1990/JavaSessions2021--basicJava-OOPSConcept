package ImpJavaSesssion;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread 1.0");
		}

	}
}

class MyThread2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread 2.0");
		}

	}
}

public class ThreadDemo2 {

	public static void main(String[] args) throws Exception {
		MyThread t1 = new MyThread();
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
		}

	}

}
