package dayAssignment;

public class ThirdThreadSynch extends Thread {

	Evenumbers e;
	public ThirdThreadSynch( Evenumbers ee) {
		this.e=ee;
	}
	 public void run()
	  {
		 
		 e.printEven(30, "Third Thread");
	    
	
	     
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
