import java.util.*;

public class ArraylistGen4{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        LinkedList list = new LinkedList();  
        list.push("java");
        list.push("arraylist");
        list.push("python");
        list.push("go");
        String s = (String)list.pop();
        System.out.println("element popped: " + s);
        list.push("language");
        System.out.println("element are: " + list);
    }
}