package dayAssignment;

public class JoinMethod {

	public static void main(String[] args) {
		FirstThread   fThread = new FirstThread();
		 SecondThread   sThread = new SecondThread();
		 ThirdThread  tThread = new ThirdThread();
		 fThread.start();
		 
		 try {
			fThread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 sThread.start();
		 try {
			sThread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 tThread.start();
		 
	}

}
