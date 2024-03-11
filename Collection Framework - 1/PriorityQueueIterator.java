import java.util.*;

public class PriorityQueueIterator implements Iterable<String> {

    private PriorityQueue<String> Stlist;

    public PriorityQueueIterator() {
        this.Stlist = new PriorityQueue<>();
    }
    public void addElement(Integer element) {
        Stlist.add(element);
    }
    public void removeElement(Integer element) {
        Stlist.remove(element);
    }
    @Override
    public Iterator<String> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        PriorityQueueIterator itList = new PriorityQueueIterator();
        itList.addElement(10);
        itList.addElement(15);
        itList.addElement(12);
        itList.addElement(30);

        System.out.println("Elements in the PriorityQueue:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.removeElement(30);

        System.out.println("Elements in the PriorityQueue after removing:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}
