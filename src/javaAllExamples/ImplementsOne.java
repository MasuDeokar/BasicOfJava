package javaAllExamples;
import java.util.Scanner;
interface client 
{
	void input();
	void output();
}
class ImplementsOne implements client
{
	String Name; double Salary;
	public void input()
	{	
	Scanner r= new Scanner(System.in);
	System.out.println("Enter User Name:- ");
	Name=r.nextLine();
	
	System.out.println("Enter Monthly Salary :- ");
	Salary=r.nextDouble();
	r.close();
	}
	public void output()
	{
		System.out.println(Name+" "+Salary);
	}	
	public static void main(String[] args) 
	{
		client C = new ImplementsOne();
		C.input();
		C.output();
	}
}
