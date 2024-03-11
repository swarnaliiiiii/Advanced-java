
  class ThreadA  implements Runnable {
        public void run(){
            for(int i=0;i<=5;i++){
                System.out.println("from thread A " + i);
            }
            System.out.println("exiting threadA .....");
        }
    }
    class ThreadB  implements Runnable{
        public void run(){
            for(int i=0;i<=5;i++){
                System.out.println("from thread B " + 2*i);
            }
            System.out.println("exiting threadB .....");
        }
    }
    class ThreadC  implements Runnable{
        public void run(){
            for(int i=0;i<=5;i++){
                System.out.println("from thread C " + 3*i);
            }
            System.out.println("exiting threadC .....");
        }
    }
    public class RunThread{
        public static void main(String[] args) {
            Thread obj1 = new Thread(new ThreadA());
            Thread obj2 = new Thread(new ThreadB());
            Thread obj3 = new Thread(new ThreadC());
            obj1.start();
            obj2.start();
            obj3.start();
        }
    }

