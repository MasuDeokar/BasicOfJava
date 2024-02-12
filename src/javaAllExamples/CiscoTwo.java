package javaAllExamples;

// 5778 878  978
// 1002 764  874
// 8964 5464 904

public class CiscoTwo {

	public static void main(String[] args) {
		int arr[][] = { { 5778, 878, 978 }, { 1002, 764, 874 }, { 8964, 5464, 904 } };
		int min =arr[0][0];
		int mincol=0;
		
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
					mincol=j;
				}
			}
		}
				int k=0;
				int max =arr[k][mincol];
				for(k=0;k<3;k++)
				{
					if(arr[k][mincol]>max)
					{
						max=arr[k][mincol];
					}
					}System.out.println(max);
					}
		}
		
	

