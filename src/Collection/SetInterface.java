package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public Set<String> SetCollection()
	{
	
	Set<String> FullName=new HashSet<String>();
	
	//Set-Doesnt allow duplicate value to be stored,
	// Set is an interface-- Here data is not stored in sequential order
	
	FullName.add("Kanwar");
	FullName.add("pal");
	FullName.add("Singh");
	FullName.add("Kanwar");


	return FullName;
	}
	
public static void main(String[] args) {
	
	SetInterface e1=new SetInterface();
	
	System.out.println(e1.SetCollection());
	
	
}    	
	
}
