import java.util.*;

public class NavigablesetIterable implements Iterable<String> {

    private NavigableSet<String> Stlist;

    public NavigablesetIterable() {
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
        NavigablesetIterable itList = new NavigablesetIterable();
        itList.addElement("java");
        itList.addElement("assignment");
        itList.addElement("advanced");
        itList.addElement("language");

        System.out.println("Elements in the NavigableSet:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.removeElement("assignment");

        System.out.println("Elements in the NavigableSet after removing:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}




