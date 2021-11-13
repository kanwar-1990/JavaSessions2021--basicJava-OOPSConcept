package ImpJavaSesssion;

interface checkdemointerface {
	public void show();
}

public class anonymousdemo {

	public static void main(String... args) {
		checkdemointerface d = new checkdemointerface() {

			@Override
			public void show() {
				System.out.println("Please print me");
			}
		};

		d.show();
	}

}
