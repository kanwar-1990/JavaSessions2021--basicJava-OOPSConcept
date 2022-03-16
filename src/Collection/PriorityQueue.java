package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

public static void main(String args[])	
{	

	Queue<Object> q1=new LinkedList<>();
	
	
/*	
For retrieving of data, they have given the special methods called
as peek() and poll().
peek():
-------
• It retrieves the head element(top element) without deleting it
from queue.
• It returns null, if there is no head element present.
poll(): 
------- 
• It retrieves head element(First element) and delete it from
queue.
237 G.Ravi Kiran	
*/	
	
	q1.add("hello");
	q1.add("whats up");
	q1.add("grow");
	q1.add("google");
	
	while(q1.peek()!=null)
	{
		System.out.println(q1.poll());
	}
	

	
}

}

