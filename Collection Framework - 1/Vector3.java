import java.util.*;

public class Vector3{
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
        for(String element : list){
            System.out.println("all the elements in vector: "+ element);
        }
    }
}

