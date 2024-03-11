class Thread1 extends Thread{
    public void run(){
        try{
            System.out.println("thread1 is running .....");
            for(int i =0;i<=5;i++){
                if(i==2) 
                Thread.yield();
                System.out.println("From Thread 1: i = "+ i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
} 
class Thread2 extends Thread{
    public void run(){
        try{
            System.out.println("thread2 is running .....");
            for(int k =0;k<=5;k++){
                if(k==3){
                    sleep(5000);
                }
                System.out.println("From Thread 2: k = "+ k);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
} 
class Thread3 extends Thread{
    @SuppressWarnings("removal")
    public void run(){
        try{
            System.out.println("thread3 is running .....");
            for(int j =0;j<=5;j++){
                if(j==4){
                    stop();
                }
                System.out.println("From Thread 3: j = "+ j);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
} 


public class Demonstration_115 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("... End of execution ");
    }
}
