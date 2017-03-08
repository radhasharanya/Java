package Servlet.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashMapClass 
{

	public static void main(String args[])
	{

		HashMap<String, ArrayList<Double>> hmap = new HashMap<String, ArrayList<Double>>();
		ArrayList<Double> aryList = new ArrayList<Double>();
		aryList.add(24.00);
		aryList.add(45.00);
		hmap.put("Green", aryList);
		ArrayList<Double> aryList1 = new ArrayList<Double>();
		aryList1.add(15.56);
		aryList1.add(12.00);
		hmap.put("Blue", aryList1);
		ArrayList<Double> aryList2 = new ArrayList<Double>();
		aryList2.add(18.00);
		aryList2.add(16.00);
		hmap.put("Red", aryList2);

		Set<String> keySet = hmap.keySet();
		Iterator<String> keySetIterator = keySet.iterator();
		System.out.println("------------------------------------------------");
		System.out.println("Iterating Map ");
		System.out.println("------------------------------------------------");
		while (keySetIterator.hasNext()) 
		{

			String key = keySetIterator.next();
			Object obj = Collections.max(hmap.get(key));
			System.out.println("key: " + key + " Highest Value: " + obj);
		}

	}
}
