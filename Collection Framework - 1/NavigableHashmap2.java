import java.util.*;

public class NavigableHashmap2 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
     NavigableMap<String,Integer> ht = new TreeMap<>();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("The NavigableMap: " + ht);
      ht.remove("kim");
      System.out.println("The Updated NavigableMap: " + ht);
      }
    }
