package ImpJavaSesssion;

public class StaticArrayConcept {

	public static void main(String[] args) {

		/*
		 * two type of Array static and dynamic Array Array index outofbound, if i add a
		 * value of index 4, as the size is only 4 negative index ---is not allowed in
		 * Java for similar data type to be added we can use Array Ex--Dynamic
		 * Array---Ecom Comp Amazon---assume that, in jan 5000 order, feb 100 order if
		 * we use static array, by giving the size as 5000, the prob will be that what
		 * if the order is more than tha and also in the month of Feb 100 orders are
		 * expected, remaining 4900 will not be used totally wastage of memory,ex--u are
		 * storing the value in int, that 4 byte is taken 4*5000=20000 and 2*100=200.
		 * which clearly indicates that --memory managment or usage is not done
		 * 
		 * during the peak also dev will have to shut down server increase the memory
		 * and re start the server, which will be like 30 mins cust was not able to use
		 * amazon website, hence the static array is not the solution best exp of static
		 * Array--days in a week,days in a month, number of MD in the company performace
		 * of the script will also be not good memory full memory stackexpections , we
		 * need to always work on all this
		 * ******************************************************* Limitation ---size is
		 * fixed---we can use ArrayList or different collections second prob is similar
		 * data types-- to overcome we can use Objects Objects are super class of all
		 * the class--object are still static--As the size is fixed
		 */

		int i[] = new int[4];

		// len of array is 4
		// i[-1]=5; // -neg indexing is not allowed in array. it is allowed in python
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println("the lowest index index len is " + 0);
		System.out.println("the highest index len is " + 3);
		int len = i.length;
		System.out.println("the High index is " + (len - 1));// arthmetic expression

		// to print all the value from array--- for loop

		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		// for each loop also we can have this iteracted

		for (int e : i) {
			System.out.println(e);
		}

		// array declaration in different data type---below syntax can be used
		double d[] = new double[4];
		char c[] = new char[4];
		float f[] = new float[5];
		String s[] = new String[3];
		s[0] = "Kanwar ";
		s[1] = "pal";
		s[2] = "Singh";

		for (String FullName : s) {
			System.out.println(FullName);
		}

		Object obj[] = new Object[4];

		obj[0] = "Kanwar";
		obj[1] = 1990;
		obj[2] = 'm';
		obj[3] = "2nd July";

		for (Object OT : obj) {
			System.out.println(OT);
		}

	}

}
