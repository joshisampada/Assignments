package practise_programs;

import java.util.Scanner;

public class IfElseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value to be check");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
