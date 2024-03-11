import java.util.*;

public class Sortedset3{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        SortedSet<String> list = new TreeSet<String>();  
        list.add("java");
        list.add("arraylist");
        list.add("python");
        list.add("c++");
        System.out.println("Initial SortedSet: " + list);
        System.out.println("Removed element : " + list.remove("c++"));
        System.out.println("Final SortedSet: ");
        for(String element : list){
            System.out.println(element);
        }
    }
}
