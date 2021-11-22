package Javainterviewquestions;

import java.lang.reflect.Field;

public class LanguageTranslater {

	static {

		try {
			Field value = String.class.getDeclaredField("value");

			value.setAccessible(true);
			try {
				value.set("Hello kanwar", value.get("Ole Kanwar"));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		} catch (NoSuchFieldException e) {

			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

	public static void main(String... strings) {
		System.out.println("Hello kanwar");

	}

}
