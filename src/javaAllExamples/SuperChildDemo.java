package javaAllExamples;

//Super key-Word

public class SuperChildDemo extends SuperParentDemo {

	String name ="Vaishali Deokar";
	
	public SuperChildDemo() {
		super(); // if you want to call constructor from parent you have to put in first place in child class.  
		System.out.println("I am Child class constructor.");
	}
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}	
	
	public void getdata()
	{
		super.getdata();
		System.out.println("I am child class.");
	}
	public static void main(String[] args) {

		SuperChildDemo cd = new SuperChildDemo();
		cd.getStringdata();
		cd.getdata();
		
	}

}
