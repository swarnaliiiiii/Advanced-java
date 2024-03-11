class MyThread implements Runnable{
    public void run(){
        try{
         System.out.println("thread " + Thread.currentThread().threadId() + " is running.");
        }
      catch(Exception e){
              System.out.println(e);
      }
    }
}
public class Demonstration_114 {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 0; i<n; i++){
            MyThread obj = new MyThread();
            Thread t1 = new Thread(obj);
            t1.start();
        }
    }
}
