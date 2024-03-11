import java.util.*;

public class Hashmap1 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      HashMap ht = new HashMap();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("Age of 'Dan': " + ht.get("Dan"));
      ht.remove("kim");
      System.out.println("The size of HashMap: " + ht.size());
      //   System.out.println("hastable : " + ht);
      // System.out.println("Elements in the hashtable:");
      // for (Object key : ht.keySet()) {
      //   Object value = ht.get(key);
      //   System.out.println("Key: " + key + ", Value: " + value);}
    }
   }

