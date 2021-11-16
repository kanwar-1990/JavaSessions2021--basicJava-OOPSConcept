package Javainterviewquestions;

public class StaticandFinal {

	public static void main(String[] args) {

		System.out.println(hellow.c);

	}

}

class hellow {
	public static final int c = 10;// Since its declared as final, static block will not be executed first
	// static block in main method get executed first as soon as class is loaded
	static {
		System.out.println("Hello dont print me");
	}

}
