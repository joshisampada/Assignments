package practise_programs;

import java.util.Scanner;

public class OperatorExample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d;
		System.out.println("Enter the values");
		Scanner scan = new Scanner(System.in);
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		
		int min=(a<b)?a:b;  
		System.out.println(min);  
		
		int mini=(c<d)?c:d;  
		System.out.println(mini);  

	}

}
