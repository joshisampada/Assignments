package oOOP.Concept;

import java.util.Scanner;

public class StudentClassObjectExample3UI 
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int id;
		String name;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the ID of Student");
	    id = scan.nextInt();
	    
	    System.out.println("Enter the name of the Student");
	    name = scan.next();
	    System.out.println("");
	    System.out.println("The ID is :" +id);
	    System.out.println("The name of student is :" +name);
	    
	    
	 
	}

}
