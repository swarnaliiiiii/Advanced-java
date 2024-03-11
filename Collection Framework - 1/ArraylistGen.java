import java.util.*;

public class ArraylistGen{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        ArrayList list = new ArrayList(5);  
        list.add(32);
        list.add("arraylist");
        list.add(true);
        list.add(3.14);
        int s = (int)list.get(0);
        String s1 = (String)list.get(1);
        System.out.println("element at 0 index: " + s);
        System.out.println("element at 1 index: " + s1);
    }
}