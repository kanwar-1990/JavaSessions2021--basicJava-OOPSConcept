package Javainterviewquestions;

public class Print1000Times {
	
	public static void main(String args[])
	{
		
		String s1="name";
        String s="i";
        
        
       s= s.replaceAll("i","iiiiiiiii");
       s= s.replaceAll("i","iiiiiiiii");
       s=s.replaceAll("i","iiiiiiiii");
         s=s.replaceAll("i",s1+"\n");
	System.out.println(s);
	}

}
