package ImpJavaSesssion;

public class StringImmutable {

	public static void main(String[] args) {

		/*String s1 = new String("Kanwar");// this will be consider in heap memory itself hence s1 and s2 will be
											// referring to two objects, hence 2 objects will be created
		String s2 = new String("Kanwar");
*/
		String s1 = "hello"; /// This will be store in String pool and only one kanwar will stored and s1 and
								/// s2 is referening to one only
		String s2 = "hello";

		
		//s1 = s1.concat(s2);
		System.out.println(s1=s1.concat(s2));
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
