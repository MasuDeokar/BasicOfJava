package javaAllExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Gudbye");
		hm.put(42, "Morning");
		hm.put(3, "Afternoon");
		hm.put(4, "Evening");
		hm.put(5, "GoodNight");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		@SuppressWarnings("rawtypes")
		Set sn = hm.entrySet(); 
		@SuppressWarnings("rawtypes")
		Iterator  it = sn.iterator();
		//
		while(it.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println( mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
