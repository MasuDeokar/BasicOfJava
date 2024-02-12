package javaAllExamples;

public class ThisDemo {
	
	int a=2;
	public void getData()
	{
		int a =3;
		System.out.println(a);
		System.out.println(this.a);
		//this refer to current object and object scope
		//lies in class level.
		int b=a+this.a;
		System.out.println(b);
	}

	public static void main(String[] args) {
	
		ThisDemo the = new ThisDemo();
		the.getData();
	}

}
