package ImpJavaSesssion;

public class ObjectCloning {

	public static void main(String args[]) throws CloneNotSupportedException {
		// three types of cloning
		// shallow,deep,cloning

		Abc obj = new Abc();
		obj.i = 6;
		obj.j = 10;

		System.out.println(obj);
		Abc obj1 = (Abc) obj.clone();
		System.out.println(obj1);

	}
}

class Abc implements Cloneable
// cloneable, helps in giving permission, market interface are basically used
// for permission
{
	int i;
	int j;

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}
