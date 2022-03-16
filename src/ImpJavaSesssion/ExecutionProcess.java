package ImpJavaSesssion;

public class ExecutionProcess {
	
	static int i=10;
     int j=20;
	
	public static void main(String... args)
	{
				System.out.println(i);	// done by class loader so no need to create an object  
				System.out.println(ExecutionProcess.i);	
				
				ExecutionProcess ep=new ExecutionProcess();
				System.out.println(ep.j);
					/*	
					EXECUTION PROCESS
				‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐
				‐Whenever we execute any program there will be two memory blocks that
				gets created.
				1. stack area also called as Execution Area
				2. Heap area also called as Storage Area
				Important points
				‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐
				1. First JVM will enter into stack area by making a call to class
				Loader.
				2. class loader is like a function(program) whose job is to load all
				static members into static pool area(SPA).
				3. SPA is a part of heap area.
				4. Once class loader loads all static members into SPA its job is
				done, so it will come out of stack area.
				5. Next JVM will make a call to main method.
				6. Upon call to any method, method will get loaded in stack area under    
				method area.
				7. Next Execution of main method will starts.
				8. Once entire execution is completed main() also come out of stack
				area.
				9. Next JVM before coming out of stack area it will make a call to
				garbage collector whose job is to cleanup entire memory for next
				execution.	
					*/	
	}

}
