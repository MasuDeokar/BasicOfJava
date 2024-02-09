package javaAllExamples;

public class OverloddingByFunction {

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a + "  " + b);
	}

	public static void main(String[] args) {

		OverloddingByFunction ol = new OverloddingByFunction();
		ol.getData(89);
		ol.getData("Shamanth");
		ol.getData(56, 92);
	}

}
