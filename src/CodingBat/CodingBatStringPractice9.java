package CodingBat;

public class CodingBatStringPractice9 {
	public static void main(String[] a)
	{
		CodingBatStringPractice9 cb=new CodingBatStringPractice9();
		System.out.println(cb.getSandwich("breadbreaxbread"));
		System.out.println(cb.zipZap("HelloXHello"));
		System.out.println(cb.starOut("ab*cd"));
	}

	public String getSandwich(String str) {
	
/*		getSandwich("breadjambread") → "jam"
		getSandwich("xxbreadjambreadyy") → "jam"
		getSandwich("xxbreadyy") → ""
*/
		if (str.indexOf("bread")==str.lastIndexOf("bread")) {
			return "";
		}
		else return str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
	}
		
           
public String zipZap(String str) {
return str.replaceAll("H...o", "Hel");
  
}
public String starOut(String str) {

return str.replaceAll("[a-zA-Z1-9]?\\*+[a-zA-Z1-9]?", "");
//? match the first or zero
//\\ is 
//return str.replaceAll("\\w?\\*+\\w?", "");
}

}

