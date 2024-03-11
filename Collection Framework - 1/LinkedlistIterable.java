import java.util.*;

public class LinkedlistIterable implements Iterable<String> {

    private LinkedList<String> Stlist;

    public LinkedlistIterable() {
        this.Stlist = new LinkedList<>();
    }
    public void pushElement(String element) {
        Stlist.push(element);
    }
    public void popElement(String element) {
        Stlist.pop();
    }
    @Override
    public Iterator<String> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        LinkedlistIterable itList = new LinkedlistIterable();
        itList.pushElement("java");
        itList.pushElement("assignment");
        itList.pushElement("advanced");
        itList.pushElement("language");

        System.out.println("Elements in the LinkedList:");
        for (String element : itList) {
            System.out.println(element);
        }
        itList.popElement("advanced");
        itList.popElement("assignment");

        System.out.println("Elements in the LinkedList after popping:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}


