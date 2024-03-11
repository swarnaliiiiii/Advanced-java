import java.util.*;

public class ArraylistIterable implements Iterable<String> {

    private ArrayList<String> Stlist;

    public ArraylistIterable() {
        this.Stlist = new ArrayList<>(5);
    }
    public void addElement(String element) {
        Stlist.add(element);
    }
    @Override
    public Iterator<String> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        ArraylistIterable itList = new ArraylistIterable();
        itList.addElement("java");
        itList.addElement("assignment");
        itList.addElement("advanced");

        System.out.println("Elements in the ArrayList:");
        for (String element : itList) {
            System.out.println(element + ", ");
        }
        
    }
}

