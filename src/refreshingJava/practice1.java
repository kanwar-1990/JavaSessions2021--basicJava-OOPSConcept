package refreshingJava;

public class practice1 {
    String username="kanwar";
	String password;
	String title;
	String url;
	
	public static void main(String[] args) {
		
		practice1 p1=new practice1();

		System.out.println(p1.username="Singh");
		System.out.println(p1.password="test@12234");
		System.out.println(p1.title="Google");
		System.out.println(p1.url="www.google.com");
	
	System.out.println(StringReverse("Kanwar"));
	System.out.println(StaticArray());
	
	}
	
	public static String StringReverse(String Name)
	{
		
		//String Name="kanwar";
		
		int count=Name.length();
		String rev="";
		
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+Name.charAt(i);
		}
		return rev;
		}

	public static int[] StaticArray()
	{
	
		int a[]=new int[5];
		double d[]=new double[0];
		char c[]=new char[0];
		float f[]=new float[0];

		
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	for (int i = 0; i < a.length; i++) {
		System.err.println(a[i]);
	}
	
	return a;
		
	
	}
	
	/**
	 * Method overloading is known 
	 */
	
	public void login()
	
	{
		
	}
	
	public void login(String username,String password) {
		
	}
	
	public void login (String username,String password,String loginBtn)
	{
		
	}
	public void login (String username,String password,String loginBtn,String SignUpLink)
	{
		
	}
	
	
	
	
	
	}

