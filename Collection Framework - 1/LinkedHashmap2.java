import java.util.*;

public class LinkedHashmap2 {
    
      public static void main(String[] args) {
      System.out.println("swarnali Bhattacharyya");
      //Map ht = new Hashtable();
      LinkedHashMap<String,Integer> ht = new LinkedHashMap<>();
      ht.put("Oli", 20);
      ht.put("Dan", 26);
      ht.put("kim",31);
      System.out.println("The LinkedHashmap: " + ht);
      ht.remove("kim");
      System.out.println("The Updated LinkedHashMap: " + ht);
      }
    }
