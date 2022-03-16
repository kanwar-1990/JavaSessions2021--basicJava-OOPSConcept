package ImpJavaSesssion;

class VariablesDemo extends demoworld {
	// three types of variable
	// instance variable=====> which are defined in a class not inside a method
	// local variable===>which are defined in a method not in a class, scope is with
	// in the method
	// class variable====>which are defined in a class, however are static
	//

	public static void main(String[] args) {

		int i = 10;
		demoworld d1 = new demoworld();

		System.out.println(i);
		System.out.println(d1.i);
		d1.show(5);
		demoworld.j = 15;

	
	}
}

class demoworld {

	int i = 5; // instance variable
	static int j = 15;// class variable

	public void show(int i)// local variable
	{
		
            this.i=i;
            
		System.out.println("********print show************");
		System.out.println(j);
	}

}
