package ImpJavaSesssion;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> Elist = new HashMap<String, String>();

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

		System.out.println(Elist.get("N"));

		System.out.println(Elist.size());

	}

}
