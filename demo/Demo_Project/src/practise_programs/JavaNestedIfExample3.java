package practise_programs;

import java.util.Scanner;

public class JavaNestedIfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age of person");
	    int age=scan.nextInt();
	    System.out.println("Enter the weight of person");
	    int weight=scan.nextInt();
	    
	    if(age>=18)
	    {
	    	if(weight>=50)
	    	{
	    		System.out.println("You are eligible to donate blood");
	    	}
	    	else
	    	{
	    		System.out.println("You are not eligible to donate blood");
	    	}
	    }
	    	else
	    {
	    	System.out.println("The age must be more than 18");
	    }
	    
	    }
	}


