package javaAllExamples;

public class NestedLoopTwo {

	public static void main(String[] args) {
	
		for(int i=1;i<=4;i++) // (Outer for Loop)this block will loop 4 time

		{
			System.out.println("Outer Loop");
			for (int j=1;j<=4;j++) // inner Loop
			{
				System.out.println("Inner Loop");
			}
			System.out.println("Outer Loop Finished");
		}

	}

}
