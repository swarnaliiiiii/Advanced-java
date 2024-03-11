import java.util.*;

public class IdentityHashmap1 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      IdentityHashMap ht = new IdentityHashMap();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("The IdentityHashMap: " + ht);
      ht.remove("kim");
      System.out.println("The Updated IdentityHashMap: " + ht);
      }
    }
