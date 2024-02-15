package javaAllExamples;

import java.util.ArrayList;

public class CollectionTrailOne {

	public static void main(String[] args) {
		
		int a []= {3,4,5,6,7,3,3,4,4,6,6,6,8,8,5};
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k =0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;			
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				if(k==1)
				{
					System.out.println("Unique number is:- " + a[i]);
				}
			}
			
		}
		 

	}

}
