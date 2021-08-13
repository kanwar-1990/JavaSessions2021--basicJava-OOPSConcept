package Javainterviewquestions;

public class reverseinteger {
	
	public static void main(String[] args) {
		
		int num=12345;
		int rev=0;
		
		while(num!=0) {//12345 is not 0 
			rev=rev*10+ num%10; //5 
			num=num/10;
		}
		System.out.println(rev);
	
	int num1=12345;
	System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	
	
	
	}
	
}
