package javaAllExamples;

class Test {
	int i;

	void display(int i) {
		this.i = i;
	}

	void show() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		Test call = new Test();
		call.display(10);
		call.show();
	}
}
