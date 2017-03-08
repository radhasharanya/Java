import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList ll= new 		LinkedList();
ll.add("A");
		ll.add(10);
		ll.add("A");
		ll.add(null); //Null values are allowed in Array list Arraylist 
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.add(2, "M");
		System.out.println(ll);
		ll.add("n");
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(1, ll);
		ll.set(2, 5);//System.out.println((Capacity());
		
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
	}

}
