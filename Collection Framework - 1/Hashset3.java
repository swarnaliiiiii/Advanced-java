import java.util.*;

public class Hashset3{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        HashSet<String> list = new HashSet<String>();  
        list.add("java");
        list.add("arraylist");
        list.add("python");
        list.add("c++");
        System.out.println("Initial HashSet: " + list);
        System.out.println("Removed element : " + list.remove("c++"));
        System.out.println("Final size of hashset: " + list.size());
        for(String element : list){
        System.out.println("Final HashSet: " + element);
        }
    }
}
