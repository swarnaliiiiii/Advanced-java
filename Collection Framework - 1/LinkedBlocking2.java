import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlocking2 {

	public static void main(String args[])
	{
		LinkedBlockingQueue<Integer> list= new LinkedBlockingQueue<>();
		list.add(10);
		list.add(20);
		list.add(15);
        list.add(30);
		System.out.println("LinkedBlockingQueue: "+list);
        list.clear();
        System.out.println(" ELEMENT after removing: "+list);
	}
}
