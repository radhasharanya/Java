package dayAssignment;

public class ThirdThread extends Thread {

	 public void run()
	  {
	  
	    
	     for (int i=1; i<=10; i++)
	     {
	    	 System.out.println( "Messag from Third Thread : " +i);
		
	     }
	     
	     try
	        {
	           Thread.sleep(1000);
	        }
	        catch (InterruptedException e)
	        {
	          
	          System.out.println(  "Third Thread is interrupted "+e);
	        }
	}

}
