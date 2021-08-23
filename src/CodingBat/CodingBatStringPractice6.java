package CodingBat;

public class CodingBatStringPractice6 {
	public static void main(String[] args) {
		CodingBatStringPractice6 cb = new CodingBatStringPractice6();
		System.out.println(cb.countCode("codexxcodexxcode"));
		System.out.println(cb.endOther("AbC", "HiaBc"));
	    System.out.println(cb.xyzThere("abc.xyz"));
	
	}

	public int countCode(String str) {
		// countCode("aaacodebbb") → 1

		int count = 0;// counter for getting the count
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
				count++;
			}
		}
		return count;
	}

	public boolean endOther(String a, String b) {
		/*
		 * endOther("Hiabc", "abc") → true endOther("AbC", "HiaBc") → true
		 * endOther("abc", "abXabc") → true
		 * 
		 */

		while (a.substring(a.length() - 2, a.length() - 1)
				.equalsIgnoreCase((b.substring(b.length() - 2, b.length() - 1)))) {

			if (a.endsWith(a.toLowerCase()) || b.endsWith(b.toLowerCase())) {
				return true;
			} else
				return false;
		}
		return false;

	}

	public boolean xyzThere(String str) {
		  //xyzThere("abcxyz") → true
		for(int i=0;i<str.length()-2;i++)
		{
		   if (str.charAt(i)=='.') {
			i++;
		}else if(str.substring(i,i+3).equals("xyz"))	
	     		return true;

	}
	return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
