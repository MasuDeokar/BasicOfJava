package javaAllExamples;

public class ReturnTypeOne {

/* Method with an integer return type and no arguments */  
	    public int CompareNum()   
	    {   
	        int x = 3;  
	        int y = 8;  
	        System.out.println("x = " + x + "\ny = " + y);  
	        if(x>y)  
	            return x;  
	        else  
	            return y;  
	    }  
	      
	    /* Driver Code */  
	    public static void main(String ar[])   
	    {  
	    	ReturnTypeOne obj = new ReturnTypeOne();  
	        int result = obj.CompareNum();  
	        System.out.println("The greater number among x and y is: " + result);  
	    }  
	}  