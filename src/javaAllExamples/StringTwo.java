package javaAllExamples;
public class StringTwo
{
	public static void main(String [] args)
	{
		String input = "I Love India and also Chandryaan 3!!!";
		String[] word = input.split(" ");
		
		if(word.length >=7){
			String reversall= word[6]+" "+word[5]+" "+word[4]+" "+word[3]+" "+word[2]+" "+word[1]+" "+word[0];
			System.out.println("Input String is:- "+input);
			System.out.println("Output String is:- "+reversall);
		}
		else{
			System.out.println("String lenght is greater than 3, please give input >=3!!!");
		}
	}
}

		