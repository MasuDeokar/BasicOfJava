package javaAllExamples;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a =7;
		int b=0;
		try
		{
			int c= a/b;
		    System.out.println(c);
			
			int arr[]=new int [5]; // for this exception comment int c= a/b;
			System.out.println(arr[7]);
		}
		catch(ArithmeticException am)
		{
			System.out.println("I catch Arithmetic Exception.");
		}
		catch(IndexOutOfBoundsException iob)
		{
			System.out.println("I catch index out of bounds exception.");
		}
		catch(Exception e)
		{
			System.out.println("I catch error and exception.");
		}
	}

	}


