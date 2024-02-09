package javaAllExamples;

public class Overriding extends ParentClassDemo {
	
	public void audioSystem()
	{
		System.out.println("AudioSystem Child code is updated.");
	}
	
	public void engine()
	{
		System.out.println("New Engine");
	}
	
	public void color()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
		
		Overriding cd = new Overriding();
		cd.color();
		cd.breaks();
		cd.audioSystem();
		cd.gear();
		cd.engine();

	}

}
