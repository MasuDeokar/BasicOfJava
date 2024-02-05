//WAP to find sum of 2 array element will be 6.

package javaAllExamples;
public class itefive{
	public static void main(String [] args){
		int [] arr={0,1,2,3,4,5,6,7,8,9,10,11,-1,-2,-3,-4,-5,-6};
		int Length=arr.length;
		System.out.println("Total lenghth of array is : "+Length);
		int elementSum=6;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==elementSum){
					System.out.println("Pair found :-> "+arr[i]+ " + "+arr[j]+" = "+elementSum);
				
			
}
}
}
}
}