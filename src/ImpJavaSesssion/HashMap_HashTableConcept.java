package ImpJavaSesssion;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMap_HashTableConcept {

	public static void main(String[] args) {

		// HashMap<String, String> Elist = new HashMap<String, String>();
		Map<String, String> Elist = new HashMap<String, String>();

		// I Can use either of them , we can also typcast Map to HashMap Since it his
		// superInterface
		// Since HashMap works of key and value pair, we can not use for loop Since it
		// is order less and no as per index data is stored
		// We can use for each loop and with the help on entry method we can print all
		// HashMap is usally used in API

		Elist.put("A", "tOMMY");
		Elist.put("B", "tOM");
		Elist.put("C", "MMY");
		Elist.put("D", "OMMY");
		Elist.put("E", "tOMM");
		Elist.put("F", "MY");
		Elist.put("J", "sUNNY");
		Elist.put("K", "kILLER");
		Elist.put("L", "STOP");
		Elist.put("M", "hARISH");
		Elist.put("N", "KANWAR");
		Elist.put("O", "PANDA");
		Elist.put("P", "LEO");
		Elist.put("Q", "NARDO");
		Elist.put("R", "KIKI");
		Elist.put("S", "KOKO");
		Elist.put("T", "KOKE");
		Elist.put("W", "KOKF");
		Elist.put("X", "KOKS");
		Elist.put(null, "KOKS");
		Elist.put("afgan", null);
		Elist.put("harayana", null);
		
		int nbThreads =  Thread.getAllStackTraces().keySet().size();
		System.out.println("Number of threads is "+nbThreads);
		/*
	 HashMap and Hashtable
	 -->Hashtable can be considered in place of HashMap
	 Since HashMap is non synchronized and not thread safe....
	 Suppose an object is created of HashMap and thread starts working on the key,value basis. if thread is already working on it
	 and other thread are not aware of it, Since the thread is not updated will start working on the same keyvalue pair
	 Hashtable is  synchronized as the other threads will not come into place as the current thread is working on it
	 
	 -->HashMap offers one null key and multiple null value
	    Hashtable offers no null on key and value
	    
	    Hashtable is recommended only when more threads are used 
		
		*/

		System.out.println(Elist.get("N"));

		System.out.println(Elist.size());

	for (Map.Entry e : Elist.entrySet()) {

			System.out.println(e.getKey() + " " + e.getValue());
		}

		Hashtable<String, String> ProductDetails = new Hashtable<String, String>();
		ProductDetails.put("Apple Mac", "2000");
		ProductDetails.put("i pod", "400");
		ProductDetails.put("speaker", "500");
		System.out.println(ProductDetails);
		for (Map.Entry r : ProductDetails.entrySet()) {
			System.out.println(r.getKey() + " " + r.getValue());
		}

	}

}
