package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
	
	public static void main(String args[])
	{
		HashSet<Object> s1=new HashSet<Object>();
		s1.add("hello");
		s1.add("watch");
		s1.add("fooool");
		s1.add("google");

		Iterator<Object>i1 =s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
