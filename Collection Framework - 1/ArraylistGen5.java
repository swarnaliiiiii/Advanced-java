import java.util.*;

public class ArraylistGen5{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        LinkedList<String> list = new LinkedList<String>();  
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
