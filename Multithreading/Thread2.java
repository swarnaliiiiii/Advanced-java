public class Thread2 extends Thread{
    public void run(){
        System.out.println("this is a thread");
    }
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        Thread2 t3 = new Thread2();

        System.out.println("the priority of T1 " + t1.getPriority());
        System.out.println("the priority of T2 " + t2.getPriority());
        System.out.println("the priority of T3 " + t3.getPriority());

        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);

        System.out.println("the new priority of T1 " + t1.getPriority());
        System.out.println("the new priority of T2 " + t2.getPriority());
        System.out.println("the new priority of T3 " + t3.getPriority());

        System.out.println("current thread running: " + Thread.currentThread().getName());
    }
}

