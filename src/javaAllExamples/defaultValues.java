package javaAllExamples;

	class global{
		float a;
		byte b;
		int i;
		double d;
		long l;
		boolean m;
		short s;
		
		public void test(){
		System.out.println("Value of float is-->"+a);	
		System.out.println("Value of byte is-->"+b);
		System.out.println("Value of int is-->"+i);
		System.out.println("Value of double is-->"+d);
		System.out.println("Value of long is-->"+l);
		System.out.println("Value of boolean is-->"+m);
		System.out.println("Value of short is-->"+s);
		
		}
	}
	public class DefaultValues {

		public static void main(String[] args) {

			global demo= new global();
			demo.test();

		}

	}


