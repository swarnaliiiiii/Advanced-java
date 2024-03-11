import java.util.*;

public class Treemap3 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      TreeMap<String,Integer> ht = new TreeMap<>();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("Element in the TreeMap: ");
      for(Object key : ht.keySet()){
        Object value = ht.get(key);
      System.out.println("key:" + key + "value: " + value);
      }
      }
    }
