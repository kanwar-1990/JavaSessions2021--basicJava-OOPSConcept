package CodingBat;

public class CodingBatStringPractice5 {
	public static void main(String[] args) {
		CodingBatStringPractice5 cb = new CodingBatStringPractice5();
		System.out.println(cb.startWord("hippo", "xip"));
		//System.out.println(cb.withoutX("x"));
		System.out.println(cb.doubleChar("The"));

	}

	public String startWord(String str, String word) {
		/*
		 * startWord("hippo", "hi") → "hi" startWord("hippo", "xip") → "hip"
		 * startWord("hippo", "i") → "h"
		 * 
		 */

		if (word.length() == 1)
			return str.substring(0, 1);
		else if (word.length() == 0)
			return str.substring(0, 1);
		else if (str.substring(0, 1).equals(word.substring(0, 1))) {
			return str.substring(0, 1) + word.substring(1, 2);
		} else if (str.length() == 1) {
			return "";
		}

		else
			return str.substring(0, 3);
	}

	/*public String withoutX(String str) {

		
		 * withoutX("xHix") → "Hi" withoutX("xHi") → "Hi" withoutX("Hxix") → "Hxi
		 
		if (str.charAt(0) == 'x' && str.endsWith("x")) {
			return str.substring(1, 2) + str.charAt(str.length() - 2);
		} else if (str.startsWith("x")) {
			return str.substring(1, 3);
		} else if (str.endsWith("x")) {
			return str.substring(0, str.length() - 1);
		} else if (str.isEmpty() || str.length() == 1)
			return "";
		return str;

	}*/

	
	
	public String doubleChar(String str) {
	/**
	 * doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree
	 * 	   
	 */
	int len=str.length();
	String count="";
	for (int i = 0; i < len; i++) {
	count+=""+str.charAt(i)+str.charAt(i);
	}

return count;
	}
	
	
	public int countHi(String str) {
/**
 * countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2 

 */
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			String temp=str.substring(i,i+1);
		
		if(temp.equals("hi")) {
			
		
		count++;	
		}
		}
		return count;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
