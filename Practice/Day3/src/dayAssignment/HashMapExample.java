package dayAssignment;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		HashMap<Integer, String> hashmaptwo = new HashMap<Integer, String>();

		hashmap.put(1, "one");
		hashmap.put(2, "two");
		hashmap.put(3, "three");
		hashmap.put(4, "four");
		hashmaptwo.putAll(hashmap);
		hashmaptwo.put(5, "Five");
		System.out.println("First Hasmap " + hashmap);
		System.out.println("Second HashMap "+hashmaptwo);
		System.out.println("HashMap key Set "+hashmap.keySet());
		System.out.println("HashMap Entry Set"+hashmaptwo.entrySet());

		System.out.println("Value of second: " + hashmap.get(2));
		System.out.println("Is HashMap empty? " + hashmap.isEmpty());
		hashmap.remove(3);
		System.out.println(hashmap);
		System.out.println("Size of the HashMap: " + hashmap.size());

	}

}
