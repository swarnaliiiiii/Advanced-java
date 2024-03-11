class TestThread implements Runnable {
        public Thread t;
        private String thName;
        boolean suspended = false;
        TestThread(String name){
        this.thName = name;
        System.out.println("Creating " + thName );
        }
        public void run() {
        System.out.println("Running " + thName );
        try {
        for(int i = 10; i > 0; i--) {
        System.out.println("Thread: " + thName + ", " + i);
        // Let the thread sleep for a while.
        Thread.sleep(300);
        synchronized(this) {
        while(suspended) {
        wait();
        }
        }
        }
        } catch (InterruptedException e) {
        System.out.println("Thread " + thName + " interrupted.");
        }
        System.out.println("Thread " + thName + " exiting.");
        }
        public void start ()
        {
        System.out.println("Starting " + thName );
        if (t == null)
        {
        t = new Thread (this, thName);
        t.start ();
        }
        }
        void suspend() {
        suspended = true;
        }
        synchronized void resume() {
        suspended = false;
        notify();
        }
        }

        public class ThControl {
        public static void main(String args[]) {
        TestThread R1 = new TestThread( "Thread-1");
        R1.start();
        TestThread R2 = new TestThread( "Thread-2");
        R2.start();
        try {
        Thread.sleep(1000);
        R1.suspend();
        System.out.println("Suspending First Thread");
        Thread.sleep(1000);
        R1.resume();
        System.out.println("Resuming First Thread");
        R2.suspend();
        System.out.println("Suspending thread Two");
        Thread.sleep(1000);
        R2.resume();
        System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
        System.out.println("Main thread Interrupted");
        }
        try {
        System.out.println("Waiting for threads to finish.");
        R1.t.join();
        R2.t.join();
        } 
        catch (InterruptedException e) {
        System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
        }
        }

