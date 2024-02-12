package javaAllExamples;

public class ConstructorDemo {
	
	// Will not return any value
	// Name of constructor name should be class name.
	// Constructor execute Block of code ;whenever an object is created.
	//Executed first code in all program.
	// if you are not define any constructor then compiler will call default or implicit constructor.
	
	public ConstructorDemo()
	{
		System.out.println("I am the Constructor.");
		System.out.println("I am the Constructor lecture One.");
	}
	public void getData()
	{
		System.out.println("I am the Method.");
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ConstructorDemo cd = new ConstructorDemo();
		// whenever you create an object constructor is called.
	}

}
