package practise_programs;

import java.util.Scanner;

public class SwitchExample2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=scan.nextInt();
		 switch(a){  
		    //Case statements  
		    case 10: System.out.println("10");  
		    break;  
		    case 20: System.out.println("20");  
		    break;  
		    case 30: System.out.println("30");  
		    break;  
		    //Default case statement  
		    default:System.out.println("Not in 10, 20 or 30");  
		    }  

	}

}
