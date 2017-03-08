import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {

	public static void main(String[] args) {
		

		Vector v = new Vector();
		//System.out.println(v.capacity());
		
		for (int i = 1; i < 10; i++) 
		{
			v.addElement(i);
		}
		Enumeration e=v.elements();
		System.out.println("vector elements using enumeration");
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			System.out.println(i);
		}
		
		
	}

}
