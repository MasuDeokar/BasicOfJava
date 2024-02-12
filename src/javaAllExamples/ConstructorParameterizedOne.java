package javaAllExamples;

//for parameterized constructor you have to pass parameter(data-types).
//to compile you have to pass parameter after object creation.
//if you are not pass parameter like this ConstructorParameterizedOne(90,57) only default constructor will execute.

public class ConstructorParameterizedOne {

	public ConstructorParameterizedOne() {
		System.out.println("I am the Constructor.");
		System.out.println("I am the Constructor lecture One.");
	}

	public ConstructorParameterizedOne(int a, int b) {
		System.out.println("I am the Parameterized Constructor.");
		int c = a + b;
		System.out.println(c);
	}

	public ConstructorParameterizedOne(String str) {
		System.out.println("I am the Single Parameterized Constructor.");
	}

	public void getData() {
		System.out.println("I am the Method.");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ConstructorParameterizedOne cd = new ConstructorParameterizedOne();
		ConstructorParameterizedOne cdp = new ConstructorParameterizedOne(90, 57);
		ConstructorParameterizedOne cdp1 = new ConstructorParameterizedOne("Hellow");

	}

}
