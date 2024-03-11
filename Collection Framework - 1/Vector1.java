import java.util.*;

public class Vector1{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        Vector list = new Vector();  
        list.addElement("java");
        list.addElement("arraylist");
        list.addElement("python");
        list.addElement("c++");
        list.insertElementAt("go" , 0);
        System.out.println("element are: " + list);
        list.removeElement("arraylist");
        System.out.println("element after remaining: " + list);
    }
}
