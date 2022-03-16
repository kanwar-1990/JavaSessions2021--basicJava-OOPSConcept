package CodingBat;

import java.util.Map;

public class CodingBatPractice14 {

	public static void main(String args[])

	{

	}

	public static Map<String, String> mapBully(Map<String, String> map) {
		// mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}

		if (map.containsKey("a")) {
			map.put("a", "");
			map.put("b", map.get("a"));
		}
		return map;
	}

	public Map<String, String> mapShare(Map<String, String> map) {
		// mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}

		map.remove("c");
		if (map.get("a") != null)

		{
			map.put("b", map.get("a"));
		}

		return map;
	}

	public Map<String, String> mapAB(Map<String, String> map) {
		// mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}

		if (map.size() == 1) {
			return map;
		}
		if (map.containsKey("a") && map.containsKey("b")) {
		}
		return map;
	}
	
	
	public Map<String, String> topping2(Map<String, String> map) {
//topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}

	       if(map.containsKey("ice cream"))
	       {
	    	   map.put("yogurt",map.get("ice cream"));
	       }
	       if(map.containsKey("spinach"))
	       {
	    	   map.put("spinach","nut");
	       }
		
		return map;
		
	}
	
	
	public Map<String, String> topping3(Map<String, String> map) {
//topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}

if(map.containsKey("potato"))
{
	  map.put("fries", map.get("potato"));
}
if(map.containsKey("salad"))
{
	map.put("spinach",map.get("salad"));
}
	
return map;	
	}	
	
	
	public Map<String, String> mapAB2(Map<String, String> map) {
	//mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}

   

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}

