import java.util.*;

public class Stack2{
    public static void main(String[] args) {
      System.out.println("Swarnali Bhattacharyya");
        Stack<String> list = new Stack<String>();  
        list.push("java");
        list.push("arraylist");
        list.push("python");
        list.push("c++");
        System.out.println("Intial stack: " + list);
        System.out.println("The element at the top of the stack is: " + list.peek());
        System.out.println(" popped element: " + list.pop());
        System.out.println(" popped element: " + list.pop());
        System.out.println(" Stack after pop operation: " + list);
    }
}
