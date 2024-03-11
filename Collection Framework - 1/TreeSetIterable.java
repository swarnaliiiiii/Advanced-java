import java.util.*;

public class TreeSetIterable implements Iterable<String> {

    private TreeSet<String> Stlist;

    public TreeSetIterable() {
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
        TreeSetIterable itList = new TreeSetIterable();
        itList.addElement("java");
        itList.addElement("assignment");
        itList.addElement("advanced");
        itList.addElement("language");

        System.out.println("Elements in the TreeSet:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.removeElement("advanced");
        itList.removeElement("assignment");

        System.out.println("Elements in the TreeSet after removing:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}



