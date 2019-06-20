package practise_programs;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a>18)
		{
			System.out.println("The age is valid");
		}
	}

}
