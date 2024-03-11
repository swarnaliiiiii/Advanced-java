import java.util.*;

public class Navigableset2{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        NavigableSet<String> list = new TreeSet<String>();  
        list.add("java");
        list.add("arraylist");
        list.add("python");
        list.add("c++");
        System.out.println("Initial HashSet: " + list);
        System.out.println("Removed element : " + list.remove("c++"));
        System.out.println("Final HashSet: " + list);
    }
}
