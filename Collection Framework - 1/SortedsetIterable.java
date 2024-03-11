import java.util.*;

public class SortedsetIterable implements Iterable<String> {

    private SortedSet<String> Stlist;

    public SortedsetIterable() {
        this.Stlist = new TreeSet<>();
    }
    public void addElement(String element) {
        Stlist.add(element);
    }
    public void removeElement(String element) {
        Stlist.remove(element);
    }
    @Override
    public Iterator<String> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        SortedsetIterable itList = new SortedsetIterable();
        itList.addElement("java");
        itList.addElement("assignment");
        itList.addElement("advanced");
        itList.addElement("language");

        System.out.println("Elements in the Sortedset:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.removeElement("assignment");

        System.out.println("Elements in the Sortedset after removing:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}



