/* Use of suspend() and resume() methods */

class ThreadA extends Thread {
	public void run( ) {
		try{
			System.out.println (" First thread starts running" );
			sleep(10000);
			System.out.println (" First thread finishes running" );
		}
		catch(Exception e){	}
	}
}

class ThreadB extends Thread {
	@SuppressWarnings("removal")
    public void run( ) {
		try{
			System.out.println ( "Second thread starts running");
			System.out.println ( "Second thread is suspended itself ");
			suspend( );
			System.out.println (" Second  thread runs again" );
		}
		catch(Exception e){	}
	}
}

class Demonstration_116{
	@SuppressWarnings("removal")
    public static void main (String args[ ] ){
		try{
			ThreadA first = new ThreadA( );  // It is a newborn thread i.e. in Newborn state
			ThreadB second= new ThreadB( );  // another new born thread
			
			first.start();    // first is scheduled  for running
			second.start();   // second is scheduled for running

			System.out.println("Revive the second thread" );  // If it is suspended
			second.resume();
			
			System.out.println ("Second thread went for 10 seconds sleep " );
			second.sleep (10000);
			
			System.out.println ("Wake up second thread and finishes running" );
			System.out.println ( " Demonstration is finished ");
		}
		catch(Exception e){	}
	}
} 

