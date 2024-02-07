package javaAllExamples;
public class StringFour{
	public static void main(String [] args) 
	{
		String name1=new String("          I love india !!!");
		String name2="Hello Earth !!! I am chandryaan 3!!!";
		
		System.out.println("Trim blank spaces front\back:- "+name1.trim());
		System.out.println("Lenght of String:- "+name1.length());
		System.out.println("Lenght of String:- "+name2.length());
		System.out.println("Char/String replace:- "+name2.replace("Earth","Mars"));
		System.out.println("Print Char of given index :- "+name1.charAt(15));
		System.out.println("Print code point value of given index here v :-"+name1.codePointAt(14));
		System.out.println("Print index of startand end code point in String:- "+name1.codePointCount(13,19));
		System.out.println("Compare name1 and 2 each other as per lexicography :- "+name1.compareTo(name2));
		System.out.println("Compare code point "+name1.codePointBefore(17));
		System.out.println(name2.codePointBefore(7));
		System.out.println(name1.charAt(4));
	}
		
}