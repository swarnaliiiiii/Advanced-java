import java.util.*;

public class WeakHashmap2 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      WeakHashMap<String,Integer> ht = new WeakHashMap<>();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("The WeakHashMap: " + ht);
      ht.remove("kim");
      System.out.println("The Updated WeakHashMap: " + ht);
      }
    }
