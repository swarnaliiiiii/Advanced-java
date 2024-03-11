import java.util.*;

public class TreeSet3{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        TreeSet<String> list = new TreeSet<String>();  
        list.add("java");
        list.add("arraylist");
        list.add("python");
        list.add("c++");
        System.out.println("Initial TreeSet: " + list);
        System.out.println("Removed element : " + list.remove("c++"));
        System.out.println("are all the ememnts in Treeset: ");
        for(String element : list){
            System.out.println(element + " , ");
        }
    }
}
