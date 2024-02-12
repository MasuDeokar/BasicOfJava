package javaAllExamples;

public class AccessModifierDemo {

	public void abs() {
		System.out.println("Hello I am Chandryaan #!!!"); // Public access modifier.
		// it can use this method and variable anywhere in same package and outside of
		// package.
	}

	void abc() {
		System.out.println("Hello I am AdityaL1 #!!!"); // Default access modifier.
		// it can use this method and variable anywhere in same package not out side of
		// package.
	}

	private void abd() {
		System.out.println("Hello I am Earth #!!!"); // Private access modifier.
		// you can not access method or variable out side of class or package.
		// access limited to class only.
	}

	protected void abe() {
		System.out.println("Hello I am Sun #!!!"); // Protected access modifier.
		// it can use in subclasses only and only if we extends or inherit the Parent class.
		//also other package only if inherit after creating object of subclass.
		//this is next to default access-modifier after inherit.
	}

	public static void main(String[] args) {

		AccessModifierDemo obj = new AccessModifierDemo();
		obj.abs();
		obj.abc();
		obj.abd();
		obj.abe();

	}

}
