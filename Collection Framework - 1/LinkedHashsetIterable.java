import java.util.*;

public class LinkedHashsetIterable implements Iterable<String> {

    private LinkedHashSet<String> Stlist;

    public LinkedHashsetIterable() {
        this.Stlist = new LinkedHashSet<>();
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
        LinkedHashsetIterable itList = new LinkedHashsetIterable();
        itList.addElement("java");
        itList.addElement("assignment");
        itList.addElement("advanced");
        itList.addElement("language");

        System.out.println("Elements in the LinkedHashSet:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.removeElement("assignment");

        System.out.println("Elements in the LinkedHashSet after removing:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}


