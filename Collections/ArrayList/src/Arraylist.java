import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		ar.add("A");
		ar.add(10);
		ar.add("A");
		ar.add(null); //Null values are allowed in Array list Arraylist 
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);
		ar.add(2, "M");
		System.out.println(ar);
		ar.add("n");
		System.out.println(ar);
		System.out.println(ar.size());
		ar.addAll(1, ar);
		System.out.println(ar);
		ar.clear();
		System.out.println(ar);
	}

}
