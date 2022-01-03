package ImpJavaSesssion;

public class CallByvalueandCallbyreference {

	String version;
	double versionu;
	String vendor;

	public void getinfo(CallByvalueandCallbyreference va) {
		System.out.println(version + " " + versionu + " " + vendor);
	}

	public void getvalue(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String... args) {
		// We need to understand that only one object is created
		// java supports call by reference and call by value as well

		CallByvalueandCallbyreference ca = new CallByvalueandCallbyreference();
		ca.vendor = "google";
		ca.versionu = 98.7;
		ca.version = "Basic";
		ca.getinfo(ca);// call by reference
		ca.getvalue(10, 20);// call by value

	}
}
