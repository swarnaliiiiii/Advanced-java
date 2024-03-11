import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingIterator implements Iterable<Integer> {

    private PriorityBlockingQueue<Integer> Stlist;

    public PriorityBlockingIterator() {
        this.Stlist = new PriorityBlockingQueue<>();
    }
    public void addElement(int i) {
        Stlist.add(i);
    }
    public void removeElement(Integer element) {
        Stlist.remove();
    }
    @Override
    public Iterator<Integer> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        PriorityBlockingIterator itList = new PriorityBlockingIterator();
        itList.addElement(10);
        itList.addElement(15);
        itList.addElement(12);
        itList.addElement(30);

        System.out.println("Elements in the PriorityBlockingQueue:");
        for (Integer element : itList) {
            System.out.println(element);
        }
        itList.removeElement(30);

        System.out.println("Elements in the PriorityBlockingQueue after removing:");
        for (Integer element : itList) {
            System.out.println(element);
        }
    }
}
