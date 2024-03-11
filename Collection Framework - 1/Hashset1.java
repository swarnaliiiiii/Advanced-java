import java.util.*;

public class Hashset1{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        HashSet list = new HashSet();  
        list.add("java");
        list.add("arraylist");
        list.add("python");
        list.add("c++");
        System.out.println("Initial HashSet: " + list);
        System.out.println("Removed element : " + list.remove("c++"));
        System.out.println("Final size of hashset: " + list.size());
        System.out.println("Final HashSet: " + list);
    }
}
