package CodingBat;

public class CodingBatStringPractice {

	public static void main(String[] args) {
		System.out.println(helloName("BOB"));
		System.out.println(makeAbba("Hi","Bye"));
		System.out.println(makeAbba("Yo","Alice"));
		//System.out.println(makeTags("i","Yay"));

		System.out.println(makeOutWord(" [[]]","word"));
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("Hello"));
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo(""));
            System.out.println(firstHalf("WooHoo"));
            System.out.println(firstHalf("HelloThere"));

	System.out.println(withoutEnd("Hello"));
	System.out.println(comboString("Hello","Hi"));
	}


public static String helloName(String name) {
	  return "Hello "+name;
	}


public static String makeAbba(String a, String b) {
	  return a+b+b+a;
}


public static String makeTags(String tag, String word) {
	  //makeTags("i", "Yay") → "<i>Yay</i>"
	  return "<"+tag+">"+word+"</"+tag+">";// works Fine
	  
	}

public static String makeOutWord(String out, String word) {
//	makeOutWord("<<>>", "Yay") → "<<Yay>>"
  return out.substring(1,2)+out.substring(1,2)+word+out.substring(3,4)+out.substring(3,4);
}

public static String extraEnd(String str) {
	//extraEnd("Hello") → "lololo"
		
  return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);

}
public static String firstTwo(String str) {
	  //firstTwo("Hello") → "He"
int singlevalue=str.length();
if (str.length()==0) {
	return str;
}

if (singlevalue<2) {
	return str;
}	else
return str.substring(0, 2);
}


public static String firstHalf(String str) {
	  //firstHalf("WooHoo") → "Woo"
return str.substring(0,str.length()/2); // We can divide length into half since 
}

public static String withoutEnd(String str) {
//withoutEnd("Hello") → "ell"
  return str.substring(1, str.length()-1);
	
}


public static String comboString(String a, String b) {
//	comboString("Hello", "hi") → "hiHellohi"
	return b+a+b;
	
	
}







}