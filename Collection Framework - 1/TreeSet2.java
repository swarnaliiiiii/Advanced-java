import java.util.*;

public class TreeSet2{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        TreeSet<String> list = new TreeSet<String>();  
        list.add("java");
        list.add("arraylist");
        list.add("python");
        list.add("c++");
        System.out.println("Initial TreeSet: " + list);
        System.out.println("Removed element : " + list.remove("c++"));
        System.out.println("are all the ememnts removed? " + list.removeAll(list));
    }
}
