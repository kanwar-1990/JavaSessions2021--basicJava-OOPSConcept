package OOps_Abstract;

public abstract class Page {

/* Object of abstract cannot be created
*Constructor Can be created in a abstract class
*abstract method cannot have a method body
*
*
*
*
*/	
	
	Page() {
		System.out.println("Page------Const");
	}

	public abstract void header();

	public abstract void url();

	public abstract void title();

	public void loading() {
		System.out.println("Page-----loading");
	}

	public static final void logo() {
		System.out.println("Page====load");
	}

}
