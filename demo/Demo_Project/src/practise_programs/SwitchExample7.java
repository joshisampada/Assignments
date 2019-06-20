package practise_programs;

import java.util.Scanner;

public class SwitchExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int level=0;
		System.out.println("Enter the String of your choice");
		String levelString=scan.next();
		//Using String in Switch expression  
	    switch(levelString){    
	    //Using String Literal in Switch case  
	    case "Beginner": level=1;  
	    break;    
	    case "Intermediate": level=2;  
	    break;    
	    case "Expert": level=3;  
	    break;    
	    default: level=0;  
	    break;  
	    }    
	    System.out.println("Your Level is: "+level);  

	}

}
