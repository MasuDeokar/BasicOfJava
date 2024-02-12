package javaAllExamples;

import java.util.ArrayList;

public class ArrayListExample {
	
	// Can accept duplicate values.
	//ArrayList,LinkedList,vector -> Implementing List interface.
	// Array have fixed size and where as arrayList can grow dynamically.
	//you can access and insert any value in any index.

	public static void main(String[] args) {
		
		//ArrayList has dynamic size  increase by adding and by decrease by removing.
		
		ArrayList<String> a =new ArrayList<String>();
		a.add("Shamanth");
		a.add("Java");
		a.add("Vaishali");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		//a.remove(2);
		//System.out.println(a);
		//a.remove("Java");
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("Student"));
		System.out.println(a.indexOf("Shamanth"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
