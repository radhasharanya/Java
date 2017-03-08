package dayAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Java");
		a.add("Program");
		a.remove(1);
		ArrayList<String> ar = new ArrayList<String>();
		ar.addAll(a);
		ar.add("C");
		ar.add("C++");
		ar.add("Phython");
		ar.add("DataStructures");
		ar.removeAll(a);
		System.out.println("Size of ArrayList ar is "+ ar.size());
		System.out.println("ArrayList isEmpty()is " +ar.isEmpty());

		System.out.println("iterating the elements arrayList 2");
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
