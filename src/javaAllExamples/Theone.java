package javaAllExamples;

public class Theone {

	public static String i="Hello";
	int B;
		void display(int y)
		{
						
			 B=y;
		}
		void show()
		{			System.out.println(i);

			System.out.println(B);
		}

		public static void main(String[] args) 
		{		
		Theone call=new Theone();
		call.display(10);
		call.show();
		}
	}
