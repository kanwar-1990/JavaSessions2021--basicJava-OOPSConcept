package Javainterviewquestions;

public class CountNUObjectS {

	//int i;------> Since ,everytime object gets intansiated, i value be one
	static int i;// So, we can make it as static so that it gets stored in common memory
	public CountNUObjectS()
	{
		i++;
	}
	
	
	
	public static void main(String args[])
	{
		
		CountNUObjectS co=new CountNUObjectS();
		CountNUObjectS co1=new CountNUObjectS();
		CountNUObjectS co2=new CountNUObjectS();
		CountNUObjectS co3=new CountNUObjectS();
      System.out.println("Count of object is :" +co.i);
/*      System.out.println(co1.i);
      System.out.println(co2.i);
      System.out.println(co3.i);
*/
	
	
	
	
	}
}
