import java.util.Scanner;

class logic{
    int n;
    int num[];
    logic(int n){
        this.n=n;
    }
    public void ReadNumbers(){
               Scanner obj = new Scanner(System.in);
               num = new int[n];
               System.out.println("enter" + n + "numbers");
               for(int i=0;i<n;i++){
                         num[i] = obj.nextInt();
               }
    }
}

class Mythread1 implements Runnable{
    Thread t;
    logic l;

    Mythread1(logic l){
        this.l = l;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        l.ReadNumbers();
    }
}

public class Multithread {
    public static void main(String[] args) throws InterruptedException {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter n:");
        int n = obj.nextInt();
        logic l = new logic(n);
        Mythread1 t1 = new Mythread1(l);
    }
}
