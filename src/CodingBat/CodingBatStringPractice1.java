package CodingBat;

public class CodingBatStringPractice1 {
	public static void main(String[] args) {

System.out.println(nonStart("Hello", "there"));
            System.out.println(left2("Hello"));
            System.out.println("hello");
System.out.println(right2("fixed"));		
	
//theEnd("Hello", true) → "H"
System.out.println(theEnd("Hello",false));
	System.out.println(withouEnd2("ab"));
	}

	public static String nonStart(String a, String b) {

		// nonStart("Hello", "There") → "ellohere"

		return a.substring(1, a.length()) + b.substring(1, b.length());	}

	public static String left2(String str) {

		// left2("Hello") → "lloHe"

	return str.substring((str.length()-2))+str.substring(0, 2);}
		public static String right2(String str) {
//right2("Hello") → "loHel"
//fixed 
			System.out.println(str.length()); //5
			System.out.println(str.length()-1);//4
			System.out.println(str.length()-2);//3 

System.out.println(str.charAt(0));//
System.out.println(str.charAt(1));
System.out.println(str.charAt(2));
System.out.println(str.charAt(3));
System.out.println(str.charAt(4));
//fixed
//edfix
		


return str.substring(str.length()-2, str.length()) + str.substring(0,str.length()-2);
		// edfix+
	}

		
		public static String theEnd(String str, boolean front) {
			/*  
			theEnd("Hello", true) → "H"
            theEnd("Hello", false) → "o"
             theEnd("oh", true) → "o"

			*/
			if(front==true) {
				return str.substring(0,1);
			}else
		return str.substring(str.length()-1);
		
		}
		
		public static String withouEnd2(String str) {
			/*
			withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → 
			*/
		if (str.length()==0){
			return "";
		}
			
			return str.substring(1,str.length()-1); 
			
		}


	

}
