import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlacking3 {

	public static void main(String args[])
	{
		LinkedBlockingQueue<Integer> list= new LinkedBlockingQueue<>();
		list.add(10);
		list.add(20);
		list.add(15);
        list.add(30);
		System.out.println("LinkedBlockingQueue: "+list);
        list.clear();
        System.out.println(" all the elements in LinkedBlockingQueue: "+list);
        list.add(50);
        for(Integer element : list){
            System.out.println(element);
        }
        
	}
}