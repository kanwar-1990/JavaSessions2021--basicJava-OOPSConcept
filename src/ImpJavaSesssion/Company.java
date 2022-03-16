package ImpJavaSesssion;

import java.util.ArrayList;

public class Company {

	public void GetTotalCount() {
		System.out.println("***********GetTotalCount**********");
	}

	public String[] Cofounder() {

		String founder[] = new String[3];

		founder[0] = "pepsi";
		founder[1] = "CocaCola";
		founder[2] = "Nyka";

		return founder;

	}

	public ArrayList<String> CustomerList() {

		ArrayList<String> obj = new ArrayList<String>();

		obj.add("kanwar");
		obj.add("Singh");
		obj.add("pal");
		obj.add("chalotra");
		System.out.println(obj);

		return obj;

	}

	public static void main(String[] args) {

		Company Comp = new Company();

		String[] a = Comp.Cofounder();

		System.out.println("Number of CO-founders " + a.length);

		for (String c : a) {
			System.out.println(c);
		}

		ArrayList<String> b = Comp.CustomerList();

		System.out.println("Total number of CustomerList " + b.size());

		for (String d : b) {
			System.out.println(d);
		}

		Comp.GetTotalCount();

	}

}
