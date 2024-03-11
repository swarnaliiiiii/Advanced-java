import java.util.*;

public class Hashmap2 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      HashMap<String,Integer> ht = new HashMap<>();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("Age of 'Dan': " + ht.get("Dan"));
      ht.remove("kim");
      System.out.println("The size of HashMap: " + ht.size());
      }
    }
