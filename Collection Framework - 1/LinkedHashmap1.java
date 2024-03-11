import java.util.*;

public class LinkedHashmap1 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      LinkedHashMap ht = new LinkedHashMap();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("The LinkedHashmap: " + ht);
      ht.remove("kim");
      System.out.println("The Updated LinkedHashMap: " + ht);
      //   System.out.println("hastable : " + ht);
      // System.out.println("Elements in the hashtable:");
      // for (Object key : ht.keySet()) {
      //   Object value = ht.get(key);
      //   System.out.println("Key: " + key + ", Value: " + value);}
    }
   }

