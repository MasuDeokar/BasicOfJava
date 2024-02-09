package javaAllExamples;

public class AustrellianTraffic implements CentralTrafficInterfaceOne,ContinentalTraffic {

	public static void main(String[] args) {
		
		CentralTrafficInterfaceOne a= new AustrellianTraffic();
		a.redStop();
		a.greenGo();
		a.flashYellowWait();
		
		AustrellianTraffic b= new AustrellianTraffic();
		b.walkonsymbol();
		
		ContinentalTraffic c= new AustrellianTraffic();
		c.transportSymbol();
		
	}

	@Override
	public void greenGo() {
		
		System.out.println("greengo implementation");
	}
	
	public void walkonsymbol() 
	{
		System.out.println("walk After symbol green");
	}
		
	

	@Override
	public void redStop() {
		
		System.out.println("redstop implementation");
		
	}

	@Override
	public void flashYellowWait() {
		System.out.println("flash yellow wait implementation");
		
	}

	@Override
	public void transportSymbol() {
		
		System.out.println("Obey described traffic rules");
		
	}

}
