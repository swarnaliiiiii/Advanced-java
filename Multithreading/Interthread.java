class main{
boolean flag = false;
public synchronized void Question(String msg) {
if (flag) {
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println(msg);
flag = true;
notify();
}
public synchronized void Answer(String msg) {
if (!flag) {
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println(msg);
flag = false;
notify();
}
}
class T1 implements Runnable {
main m;
String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };
public T1(main m1) {
this.m = m1;
new Thread(this, "Question").start();
}
public void run() {
for (int i = 0; i < s1.length; i++) {
m.Question(s1[i]);
}
}
}
class T2 implements Runnable {
main m;
String[] s2 = { "Hi", "I am good, what about you?", "Great!" };
public T2(main m2) {
this.m = m2;
new Thread(this, "Answer").start();
}
public void run() {
for (int i = 0; i < s2.length; i++) {
m.Answer(s2[i]);
}
}
}
public class Interthread {
public static void main(String[] args) {
main m = new main();
new T1(m);
new T2(m);
}
}




