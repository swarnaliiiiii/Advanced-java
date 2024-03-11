
import java.io.*; 

class Threadmain 
{ 
	synchronized public void getLine() 
	{ 
		for (int i = 0; i < 3; i++) 
		{ 
			System.out.println(i); 
			try
			{ 
				Thread.sleep(400); 
			} 
			catch (Exception e) 
			{ 
				System.out.println(e); 
			} 
		} 
	} 
} 

class Threadmain2 extends Thread 
{  
	Threadmain  line; 
	Threadmain2 (Threadmain  line) 
	{ 
		this.line = line; 
	} 
	public void run() 
	{ 
		line.getLine(); 
	} 
} 

public class SyncThread1 
{ 
	public static void main(String[] args) 
	{ 
		Threadmain  obj = new Threadmain(); 
		Threadmain2  t1 = new Threadmain2(obj); 
		Threadmain2  t2 = new Threadmain2(obj); 
		t1.start(); 
		t2.start(); 

	} 
} 
