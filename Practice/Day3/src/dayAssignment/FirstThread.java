package dayAssignment;

public class FirstThread extends Thread {

	 public void run()
	  {
	 
	    
	     for (int i=1; i<=10; i++)
	     {
	    	 System.out.println( "Messag from First Thread : " +i);
		
	     }
	     
	     try
	        {
	           Thread.sleep(1000);
	        }
	        catch (InterruptedException e)
	        {
	          
	          System.out.println(  "First Thread is interrupted "+e);
	        }
	}

}
