package practise_programs;

import java.util.Scanner;

public class OperatorExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the appropriate values");
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		System.out.println(a<b && a<c);//false && true = false  
		System.out.println(a<b & a<c);//false & true = false  


	}

}
