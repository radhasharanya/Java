package dayAssignment;

public class FirstThreadSynch extends Thread {
	Evenumbers e;
	public FirstThreadSynch( Evenumbers ee) {
		this.e=ee;
	}
	 public void run()
	  {
		 
		 e.printEven(10, "First Thread");
	    
	     
	     
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
