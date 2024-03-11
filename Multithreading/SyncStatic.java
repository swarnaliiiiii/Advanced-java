class Display 
{ 
	public static synchronized void main1(String name) 
	{ 
		for(int i=0;i<3;i++) 
		{ 
			System.out.print("name: "); 
			System.out.println(name); 
			try{ 
				Thread.sleep(400); 
			} 
			catch(InterruptedException e) 
			{ 
			} 
		} 
	} 
} 

class MyThread extends Thread{ 
	Display d; 
	String name; 
	MyThread(Display d,String name) 
	{ 
		this.d=d; 
		this.name=name; 
	} 
	public void run() 
	{ 
		d.main1(name); 
	} 
} 

public class SyncStatic{ 
	public static void main(String arg[]) 
	{ 
		Display d1=new Display(); 
		Display d2=new Display(); 
		MyThread t1=new MyThread(d1,"swarnali"); 
		MyThread t2=new MyThread(d2,"bhattacharyya"); 
		t1.start(); 
		t2.start(); 
	} 
} 

