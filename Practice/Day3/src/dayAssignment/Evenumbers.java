package dayAssignment;

public class Evenumbers {
	
	 synchronized void printEven(int n,String Name)
	 
	 {
		 System.out.println("**************************");
			System.out.println(Name);
			System.out.println("**************************");
		 for(int i=1;i<=n;i++)
			{
				if(i%2==0){
					
					
					System.out.println(i);
				}
			}
	 }
	 

}
