package Javainterviewquestions;

import java.lang.reflect.Field;

public class LanguageTranslater {
	
	
	
	static {
		
		try {
			Field value=String.class.getDeclaredField("value");
			value.setAccessible(true);
			try {
				value.set("Hello kanwar",value.get("Ole Kanwar"));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
	
	public static void main(String...strings)
	{
		System.out.println("Hello kanwar");
		
		
	}

}
