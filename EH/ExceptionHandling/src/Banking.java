import java.util.Scanner;

public class Banking 
{
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	
	Banking(String cname,String cid)
	{
		customerName=cname;
		customerId=cid;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance=balance+amount;
			previousTransaction = amount;
		}
	}

	
	void withdraw(int amount) throws IllegalArgs
	{
		if(amount !=0)
		{
			balance=balance-amount;
			previousTransaction = -amount;
		}
		
		
		
	}
	
	
	void getPreviousTransaction()
	{
		if(previousTransaction>0)
		{
			System.out.println("Deposited:" +previousTransaction);
		}
		
		else if(previousTransaction<0)
		{
			System.out.println("Withdrawn:" +Math.abs(previousTransaction));
		}
		
		else
		{
			System.out.println("No transaction occured");
		}
		
    }
	
	void showMenu() 
	{
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome " +customerName);
		System.out.println("Your Id is " +customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
	
	 do
	 {
		 System.out.println("=======================================================");
		 System.out.println("Enter an option");
		 System.out.println("=======================================================");
		 option=scanner.next().charAt(0);
		 System.out.println("\n");
		 
		 switch(option)
		 {
		 
		 case 'A':
			 System.out.println("--------------------------------");
			 System.out.println("Balance = " +balance);
			 System.out.println("--------------------------------");
			 System.out.println("\n");
			 break;
			 
		 case 'B':
			 System.out.println("--------------------------------");
			 System.out.println("Enter an amount to deposit:");
			 System.out.println("--------------------------------");
			 int amount = scanner.nextInt();
			 deposit(amount);
			 System.out.println("\n");
			 break;
			 
		 case 'C':
			 
			 System.out.println("--------------------------------");
			 System.out.println("Enter an amount to withdraw:");
			 System.out.println("--------------------------------");
			
			int amount1 = scanner.nextInt();
			try {
				withdraw(amount1);
			} catch (IllegalArgs e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (amount1 > balance)
			{
					IllegalArgumentException exception =new IllegalArgumentException("Amount exceeds balance");
					throw exception;
			}
			 System.out.println("\n");
			 break;
			 
			 
		 case 'D':
			 System.out.println("--------------------------------");
			 getPreviousTransaction();
			 System.out.println("--------------------------------");
			 System.out.println("\n");
			 break;
			 
		 case 'E':
			 System.out.println("*******************************");
			 break;
			 
		
		default:
			System.out.println("Invalid option!! Please enter again");
			break;
		 	
	 }
	}while(option != 'E');
	 System.out.println("Thank you for using our services");

	
}
	

}
