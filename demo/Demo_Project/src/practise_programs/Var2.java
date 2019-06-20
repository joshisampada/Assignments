
package practise_programs;
import java.util.Scanner;	
class Var2
 {  
   public static void main(String[] args)
    {  
	 int a, b, c;
	 
     System.out.println("Enter two integers to calculate their sum");
     Scanner scan = new Scanner(System.in);  
     a=scan.nextInt();
     b=scan.nextInt();
     c=a+b;
     System.out.println("Value of A is:"+a);  
     System.out.println("Value of B is:"+b);
     System.out.println("Addition is:"+c);
    }
 }  
