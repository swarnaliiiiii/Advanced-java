import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingIterator implements Iterable<Integer> {

    private LinkedBlockingQueue<Integer> Stlist;

    public LinkedBlockingIterator() {
        this.Stlist = new LinkedBlockingQueue<>();
    }
    public void addElement(int i) {
        Stlist.add(i);
    }
    public Integer removeElement() {
       return Stlist.remove();
    }
    @Override
    public Iterator<Integer> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        LinkedBlockingIterator itList = new LinkedBlockingIterator();
        itList.addElement(10);
        itList.addElement(15);
        itList.addElement(12);
        itList.addElement(30);

        System.out.println("Elements in the LinkedBlockingQueue:");
        for (Integer element : itList) {
            System.out.println(element);
        }
        itList.removeElement();

        System.out.println("Elements in the LinkedBlockingQueue after removing:");
        for (Integer element : itList) {
            System.out.println(element);
        }
    }
}

