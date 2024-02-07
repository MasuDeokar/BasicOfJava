package javaAllExamples;
public class IterationSix{
public static void main(String[] args){
	int [] arr={0,1,2,3,4,5,6,7,8,9,10,11,21,32,13,14,15,66};
	int Length=arr.length;
	System.out.println("Lenght of given array is :->"+Length);
	int sum=0;
	for(int i=0;i < arr.length;i++){
	sum += arr[i];}
	
		System.out.println("Sum of array elements is:-> "+sum);
	}
}
