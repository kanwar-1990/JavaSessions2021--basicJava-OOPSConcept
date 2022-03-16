package ImpJavaSesssion;

public class MethodsConcept {

	// you cannot create a method inside method

	// no input no return
	public void GetName() {
		System.out.println("Get Name:==========");

	}
	// no input some return

	public int GetSum() {
		System.out.println("Getting Sum:=========\n hello");
		int total = 100;
		int count = 1000;
		int Total_Count = total + count;
		return Total_Count;

	}
	// some input and some return

	public String checking() {
	return "Checking the method";
	
	}

	public int EmpCount(int a, int b)

	{

		System.out.println("Emp Count:========");

		int sum = a + b;
		return sum;

	}

	public static void main(String[] args) {

		MethodsConcept MC = new MethodsConcept();

		int a = MC.EmpCount(10, 20);
		System.out.println(a);

		int b = MC.GetSum();
		System.out.println(b);

		MC.GetName();

	}

}
