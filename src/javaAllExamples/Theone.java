package javaAllExamples;
class Theone {

		int i;
		void display(int x)
		{
			 i =x;
		}
		void show()
		{
			System.out.println(i);
		}
	}
	class xyz
	{
		public static void main(String[] args) 
		{		
		Theone call=new Theone();
		call.display(10);
		call.show();
		}
	}
