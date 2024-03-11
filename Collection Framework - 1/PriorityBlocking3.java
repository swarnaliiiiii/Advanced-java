import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlocking3 {

	public static void main(String args[])
	{
		PriorityBlockingQueue<Integer> list= new PriorityBlockingQueue<>();
		list.add(10);
		list.add(20);
		list.add(15);
        list.add(30);
		System.out.println("all the elements PriorityBlockingQueue: ");
        for(Integer element : list){
            System.out.println(element);
        }
        
	}
}
