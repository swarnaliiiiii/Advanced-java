class ThreadA  extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("from thread A " + i);
        }
        System.out.println("exiting threadA .....");
    }
}
class ThreadB  extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("from thread B " + 2*i);
        }
        System.out.println("exiting threadB .....");
    }
}
class ThreadC  extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("from thread C " + 3*i);
        }
        System.out.println("exiting threadC .....");
    }
}
public class Thread1{
    public static void main(String[] args) {
        ThreadA obj1 = new ThreadA();
        ThreadB obj2 = new ThreadB();
        ThreadC obj3 = new ThreadC();
        obj3.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(obj2.getPriority() + 1);
		obj1.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
        System.out.println("Multithreading in over!");
    }
}