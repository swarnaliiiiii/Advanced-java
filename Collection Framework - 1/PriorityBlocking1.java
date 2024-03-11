import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlocking1 {

	public static void main(String args[])
	{
		PriorityBlockingQueue list= new PriorityBlockingQueue();
		list.add(10);
		list.add(20);
		list.add(15);
        list.add(30);
		System.out.println("PriorityBlockingQueue: "+list);
        list.clear();
        System.out.println(" ELEMENT after removing: "+list);
	}
}
