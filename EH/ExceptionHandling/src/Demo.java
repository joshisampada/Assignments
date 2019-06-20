import java.util.Scanner;

public class Demo
{

	public static void main(String[] args) throws NumberFormatException 
	{
		Scanner scnr = new Scanner(System.in);
	    String number = scnr.next();
	    try 
	    {
	        if (number.length() > 5)
	        {
	            throw new IllegalArgumentException();
	        }
	        Integer.parseInt(number);
            System.out.println("Successfull"); 
	    }
	    catch (IllegalArgumentException e)
	    {
	        e.printStackTrace();
	    }

	}

}
