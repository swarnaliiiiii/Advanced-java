import java.util.*;

public class HashsetIterable implements Iterable<String> {

    private HashSet<String> Stlist;

    public HashsetIterable() {
        this.Stlist = new HashSet<>();
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
        HashsetIterable itList = new HashsetIterable();
        itList.addElement("java");
        itList.addElement("assignment");
        itList.addElement("advanced");
        itList.addElement("language");

        System.out.println("Elements in the Hashset:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.removeElement("assignment");

        System.out.println("Elements in the HashSet after popping:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}
