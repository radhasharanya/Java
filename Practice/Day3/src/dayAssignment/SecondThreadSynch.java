package dayAssignment;

public class SecondThreadSynch extends Thread {

	Evenumbers e;
	public SecondThreadSynch( Evenumbers ee) {
		this.e=ee;
	}
	 public void run()
	  {
		 
		 e.printEven(20, "Second Thread");
	    
	     
	     try
	        {
	           Thread.sleep(1000);
	        }
	        catch (InterruptedException e)
	        {
	          
	          System.out.println(  "Second Thread is interrupted "+e);
	        }
	}

}
