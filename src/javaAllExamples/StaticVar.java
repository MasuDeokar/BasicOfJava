package javaAllExamples;

public class StaticVar {
	
	String name;               //instance variable.
	String address;            //instance variable.
	static String cityName="Pune";           //static variable or class variable.
	static int i=0;  // this is example for sharing same memory.
	
	
//	static {                      // This is static block where we can initialized all your static variables.
//		cityName="Pune";          // if you created static block no need to put value in static instance variable.
//		i=0;						// above only static String cityName;	static int i; and put values in static block.			
//	}
//	
	public StaticVar(String name,String address)
	{
		this.name=name;       //=name is local variable.
		this.address= address;
		i++;
		System.out.println(i);				
	}
	public void getAddress() {
		System.out.println(address+"  "+cityName);
	}	

	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Shamanth","Lohegaon");
		StaticVar obj1 = new StaticVar("Vaishali","Dhanori");
		StaticVar obj3 = new StaticVar("Mayuresh","Pimpri");
		obj.getAddress();
		obj1.getAddress();
		obj3.getAddress();

	}

}
