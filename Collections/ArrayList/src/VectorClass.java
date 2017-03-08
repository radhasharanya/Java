import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		
		for (int i = 1; i < 10; i++) 
		{
			v.addElement(i);
		}
		v.addElement("a");
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.remove(2);
		System.out.println(v);
		v.removeElementAt(1);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);

	}

}
