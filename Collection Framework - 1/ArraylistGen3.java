import java.util.*;

public class ArraylistGen3{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        ArrayList list = new ArrayList(5);  
        list.add(32);
        list.add("arraylist");
        list.add(true);
        list.add(3.14);
        System.out.println("Elements in the Arraylist: ");
        for (Object element : list) {
            System.out.println(element + ", ");
        }
    }
}