package javaAllExamples;

public class PatternOnetoOneTwoThree {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
