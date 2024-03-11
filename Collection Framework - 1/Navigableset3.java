import java.util.*;

public class Navigableset3{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        NavigableSet<String> list = new TreeSet<String>();  
        list.add("java");
        list.add("arraylist");
        list.add("python");
        list.add("c++");
        System.out.println("Initial NavigableSet: " + list);
        System.out.println("Removed element : " + list.remove("c++"));
        System.out.println("Final NavigableSet: " + list);
        for(Object element : list){
            System.out.println(element);
        }
    }
}
