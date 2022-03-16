package ImpJavaSesssion;

public class LoopsProgram {

	public static void main(String[] args) {

	
		  // even number // 2,4,6,8,10 // one of the easy method is that i=i+2 can we
		  //done. 
		  for (int i = 2; i <= 10; i = i + 2){ System.out.println(i); }
		  
		  // odd number // 1,3,5,7,9 
		  for (int odd = 1; odd <= 10; odd = odd + 2) {
		  System.out.println(odd); }
		 
		  // for loop with if condition // 1 to 100 // when i find the number which is
		  //divisble by 5
		  
		  for (int j = 1; j <= 100; j++) { System.out.println(j); if (j % 5 == 0) {
		  System.out.println("hii"); break; // will come outside of the loop
		  
		  // break---is not allowed in if and if else conditions
		  
		  }
		  
		  }
		  
		  // Finding Even and ODD number
		  int num = 2;
		  
		  if (num % 2 == 0) { System.out.println("number is Even"); } else {
		  System.out.println("number is ODD"); }
		 
		





	}

}
