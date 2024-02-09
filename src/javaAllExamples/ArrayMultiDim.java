package javaAllExamples;

public class ArrayMultiDim {

	public static void main(String[] args) {
	
		int a[][]=new int [2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=7;
		a[1][0]=5;
		a[1][1]=3;
		a[1][2]=9;
		
		
		
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
