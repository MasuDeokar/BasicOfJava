package javaAllExamples;

public class ArrayMaxNumb {

	public static void main(String[] args) {
		int abc [][]= {{93,56,74},{87,455,90},{48,36,78}};
		int min = abc[0][0];
		int max = abc[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
				if(abc[i][j]>max)
				{
					max=abc[i][j];
				}
			}
		}
		System.out.println("Minimum nuber in array is :-"+min);
		System.out.println("Maximum nuber in array is :-"+max);

	}

}
