package javaAllExamples;

public class ArrayMultiDimtwo {

	public static void main(String[] args) {
		
		int a[][]= {{2,5,8},{78,12,78},{6,9,10}};
		System.out.println();
		System.out.println("Output for given index of array:- "+a[1][0]);
		System.out.println();
		System.out.println("Output for whole array:- ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
				System.out.println(a[i][j]);
			}

	}
	}
}
