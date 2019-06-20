package practise_programs;
import java.util.Scanner;
public class Var5 
   {

	  public static void main(String[] args)
	   {
		// TODO Auto-generated method stub
        byte a,b,c;
        System.out.println("Enter the values");
        Scanner scan = new Scanner(System.in);
        a=scan.nextByte();
        b=scan.nextByte();
        c=(byte)(a+b);
        System.out.println("The value of A is:"+a);
        System.out.println("The value of B is:"+b);
        System.out.println("The Addition is:"+c);

        
	   }

   }
