package javaAllExamples;


import java.util.Hashtable;

public class HashTableExample {

	
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Gudbye");
		hm.put(42, "Morning");
		hm.put(3, "Afternoon");
		hm.put(4, "Evening");
		hm.put(5, "GoodNight");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
	 
		
	}

}
