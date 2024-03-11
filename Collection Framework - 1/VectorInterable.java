import java.util.*;

public class VectorInterable implements Iterable<String> {

    private Vector<String> Stlist;

    public VectorInterable() {
        this.Stlist = new Vector<>();
    }
    public void addElement(String element) {
        Stlist.addElement(element);
    }
    public void removeElement(String element) {
        Stlist.removeElement(element);
    }
    @Override
    public Iterator<String> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        VectorInterable itList = new VectorInterable();
        itList.addElement("java");
        itList.addElement("assignment");
        itList.addElement("advanced");
        itList.addElement("language");

        System.out.println("Elements in the Vector:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.removeElement("advanced");
        itList.removeElement("assignment");

        System.out.println("Elements in the Vector after popping:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}


