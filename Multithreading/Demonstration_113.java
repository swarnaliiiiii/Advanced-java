class ThreadId extends Thread { 
    public void run()  { 
        try { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + Thread.currentThread().threadId() + " is running"); 
        } 
        catch (Exception e)  { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
public class Demonstration_113{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            ThreadId object = new ThreadId(); 
            object.start(); 
        } 
    } 
}
