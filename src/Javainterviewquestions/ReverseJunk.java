package Javainterviewquestions;

public class ReverseJunk {

	public static void main(String[] args) {

		String s = "#$&%($)# java *(@@(&$@ Selenium 0123123 testNG";

		// removing junk with the help of regular expression

		s = s.replaceAll("[^a-zA-Z0-9]", ""); // Since object is stored in String pool , s can be taken by s

		System.out.println(s);
		s = s.replaceAll("[^a-zA-Z]", ""); // Since object is stored in String pool , s can be taken by s

		System.out.println(s);

	}

}
