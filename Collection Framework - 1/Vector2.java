import java.util.*;

public class Vector2{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        Vector<String> list = new Vector<String>();  
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

