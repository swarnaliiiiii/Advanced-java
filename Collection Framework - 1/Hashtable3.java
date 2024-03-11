import java.util.*;

public class Hashtable3 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      Map<String,String> ht = new Hashtable<>();
      ht.put("Oli", "sings");
      ht.put("Dan", "dances");
      ht.put("kim","acts");
      System.out.println("Element in the Hashtable: ");
      for(Object key : ht.keySet()){
        Object value = ht.get(key);
      System.out.println("key:" + key + "value: " + value);
      }
      }
}