	
import java.net.*;  
	public class DSender{  
	  public static void main(String[] args) throws Exception {  
   DatagramSocket ds = new DatagramSocket();  
	    String str = "Welcome java";  
	    InetAddress ip = InetAddress.getByName("localhost");  
	     
	    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 5000);  
	    ds.send(dp);  
    ds.close();  
	  }  
	}  

