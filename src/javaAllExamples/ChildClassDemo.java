package javaAllExamples;

public class ChildClassDemo extends ParentClassDemo {

	public void engine()
	{
		System.out.println("New Engine");
	}
	
	public void color()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
		
		ChildClassDemo cd = new ChildClassDemo();
		cd.color();
		cd.breaks();
		cd.audioSystem();
		cd.gear();
		cd.engine();

	}

}
