package practise_programs;

import java.util.Scanner;

public class Unary2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int x;
        System.out.println("Enter the value for increment & decrement ");
        Scanner scan=new Scanner(System.in);
        x=scan.nextInt();
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);



	}

}
