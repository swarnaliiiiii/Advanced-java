import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue3 {

	public static void main(String args[]) throws InterruptedException
	{
		BlockingQueue<Integer> list= new ArrayBlockingQueue<>(5);
		list.add(10);
		list.add(20);
		list.add(15);
        list.add(30);
        System.out.println("all the elements in BlockingQueue: ");
        for(Object element : list){
            System.out.println(element + ",");
        }
    }
}
