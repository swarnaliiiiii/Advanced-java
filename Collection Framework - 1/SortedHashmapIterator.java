import java.util.*;

public class SortedHashmapIterator {

    public static void main(String[] args) {
        System.out.println("swarnali Bhattacharyya");
        SortedMap<String, Object> hashMap = new TreeMap<>();
        hashMap.put("Oli", 20);
        hashMap.put("Dan", 26);
        hashMap.put("kim", 31);
        System.out.println("Elements in the SortedMap:");
         Iterator<Map.Entry<String, Object>> iterator = hashMap.entrySet().iterator();
         while (iterator.hasNext()) {
             Map.Entry<String, Object> entry = iterator.next();
             String key = entry.getKey();
             Object value = entry.getValue();
             System.out.println("Key: " + key + ", Value: " + value);}
    }
}
