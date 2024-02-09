package javaAllExamples;

public class ArrayCisco {

	public static void main(String[] args) {

		int abc[][] = { { 25, 67, 89 }, { 93, 32, 110 }, { 211, 652, 7000 } };
		int min = abc[0][0];
		int minCol = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					minCol = j;
				}
			}
		}
		int max = abc[0][minCol];
		int k = 0;
		while (k < 3) {
			if (abc[k][minCol] > max)
				
			{
				max = abc[k][minCol];
			}
			k++;
		}
		System.out.println(max);
	}

}
