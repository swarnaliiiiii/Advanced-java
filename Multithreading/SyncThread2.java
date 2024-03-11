import java.io.*; 
import java.util.*; 

 class threadA 
{ 
	String name = ""; 
	public int count = 0; 

	public void Name(String name1, List<String> lt) 
	{
		synchronized(this) 
		{ 
			name = name1; 
			count++;
		} 
		lt.add(name1); 
	} 
} 

public class SyncThread2 
{ 
	public static void main (String[] args) 
	{ 
		threadA t1 = new threadA(); 
		List<String> lt = new ArrayList<String>(); 
		t1.Name("swarnali", lt); 
		System.out.println(t1.name); 

	} 
} 

