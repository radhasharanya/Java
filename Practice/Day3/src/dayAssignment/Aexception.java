package dayAssignment;

public class Aexception  {

	public static void main(String[] args) {
		int a=0,b=9;
		try{
		int c=b/a;	
		}
 catch(ArithmeticException e){
	 System.out.println("Divide by zero"+e);
 }
	}

}
