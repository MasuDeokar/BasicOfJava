package javaAllExamples;

//  45    57    90
//  67    96    66
//  455   677   434
public class CiscoTrial {

	public static void main(String[] args) {
		
		int a [][] = {{45,57,90},{67,96,66},{455,677,434}};
		int min = a[0][0];
		int mincol = 0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
					mincol=j;
				}
			}
		}
		int k=0;
		int max=a[k][mincol];
		for(k=0;k<3;k++)
		{
			if(a[k][mincol]>max)
			{
				max=a[k][mincol];
			}
		}System.out.println(max);
	}

}
