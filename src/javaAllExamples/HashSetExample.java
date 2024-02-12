package javaAllExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	// hasSet ,Treeset , LinkedHashSet implements set interface.
	// Set class does not accept duplicate values.
	// There is no guarantee elements stored in sequential order.

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Shamanth");
		hs.add("India");
		hs.add("Maharashtra");
		hs.add("India"); // rejected duplicate value.
		hs.add("USA");
		hs.add("UK");
		hs.add("Aus");
		hs.add("SA");
		System.out.println(hs);
		System.out.println(hs.remove("Maharashtra"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i =hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}

	}

}
