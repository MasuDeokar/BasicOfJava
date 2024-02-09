package javaAllExamples;

public class ArrayMinimumNumber {

	public static void main(String[] args) {
	
		int abc [][]= {{93,56,74},{87,45,90},{48,36,78}};
		int min = abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);
		

	}

}
