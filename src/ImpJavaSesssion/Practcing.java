package ImpJavaSesssion;

public class Practcing {

	public char printChar(String name) {

		char lol = 0;
		for (int i = 0; i < name.length(); i++) {
			lol = name.charAt(i);

			System.out.println(lol);

		}
        return lol;
	}

	public static void main(String args[]) {

		Practcing p=new Practcing();
		p.printChar("hello");
       
	
	}

}
