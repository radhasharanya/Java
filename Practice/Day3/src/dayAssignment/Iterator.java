package dayAssignment;

import java.util.*;



public class Iterator {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Pen");
		a.add("Pencil");
		a.add("Papper");
		a.add("post");
		a.add("Pizza");
		System.out.println("Iterating using Iterator");
		java.util.Iterator<String> it =a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***************************************");
		System.out.println("For each Loop");
		System.out.println("***************************************");
		
		for(String arraylist:a)
		{
			System.out.println(arraylist);
		}
		
		ListIterator<String> list= a.listIterator();
		
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		 System.out.println("Iterationg in backward directiton");
	        while(list.hasPrevious()){
	            System.out.println(list.previous());
	        }
	
		
	}

}
