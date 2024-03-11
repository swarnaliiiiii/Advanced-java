import java.util.*;

public class StackIterable implements Iterable<String> {

    private Stack<String> Stlist;

    public StackIterable() {
        this.Stlist = new Stack<>();
    }
    public void pushElement(String element) {
        Stlist.push(element);
    }
    public String popElement() {
        return Stlist.pop();
    }
    public String peekElement() {
        return Stlist.peek();
    }
    @Override
    public Iterator<String> iterator() {
        return Stlist.iterator();
    }

    public static void main(String[] args) {
        System.out.println("Swarnali Bhattacharyya");
        StackIterable itList = new StackIterable();
        itList.pushElement("java");
        itList.pushElement("assignment");
        itList.pushElement("advanced");
        itList.pushElement("language");
        System.out.println("Elements in the Vector:");
        for (String element : itList) {
            System.out.println(element);
        }
        System.out.println("Elements at the top of stack :"+ itList.peekElement());
        System.out.println("Elements popped:"+ itList.popElement());

        System.out.println("Elements in the Stack after popping:");
        for (String element : itList) {
            System.out.println(element);
        }
    }
}



