package OOps_Abstract;

public abstract class Page {

/* Object of abstract cannot be created
*Constructor Can be created in a abstract class
*abstract method cannot have a method body
*
*A
*
*bstraction ( Abstract + ion ) 
------------ 
• It is the second pillar of OOPS concept. 
• The process of hiding the internal implementation and showing the 
necessary data to the end user is called as Abstraction. 
• In other words, we can say that we are not going to show method 
implementation, we will just provide method header and method 
signature. 
Examples: 
1. When we send an email, only a send button is visible but how it is 
being send is hidden. 
2. Remote of TV and AC, where we can operate through buttons, but how 
it is being operated is hidden. 
3. Driver knows only to apply brakes and accelerate, but how it is working 
is hidden. 
In JAVA abstraction can be achieved in two ways :- 
1. Using Abstract class 
2. Using Interface
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
