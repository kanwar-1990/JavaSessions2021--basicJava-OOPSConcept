package ImpJavaSesssion;

class Dominos extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("TodaysOffer-Independance Day offer is 10% off on any Pizza");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class PizzaHut extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Todays Offer-Independance Day offer is 15% off on any Pizza");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}
}

public class MultiThreading {

	public static void main(String[] args) // Main in one Thread, Which is provided for execution

	// Acheived multiThreading in this

	{
		Dominos d1 = new Dominos();
		PizzaHut p1 = new PizzaHut();

		d1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		p1.start();

	}

}
