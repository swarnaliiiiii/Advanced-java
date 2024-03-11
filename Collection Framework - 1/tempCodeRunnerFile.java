import java.util.*;

public class PriorityQueue{

	public static void main(String args[])
	{
		PriorityQueue<Integer> list = new PriorityQueue<Integer>();
		list.add(10);
		list.add(20);
		list.add(15);
        list.add(30);
		System.out.println("THE TOP ELEMENT IS: "+list.peek());
        list.remove(15);
        System.out.println(" ELEMENT after removing: "+list);
        System.out.println("polled element: " +list.peek());
        System.out.println("Final Priority queue: "+list);
	}
}