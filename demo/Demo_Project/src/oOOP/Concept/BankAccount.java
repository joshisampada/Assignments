package oOOP.Concept;

public class BankAccount 
{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a,String n,float amt)
	{
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt)
	{
		amount = amount + amt;
		System.out.println("deposited amount is : " +amt);
	}
	
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Amount is not sufficient");
			
		}
		else
		{
			amount=amount-amt;
			System.out.println("withdrawn amount is: " +amt);
		}
	}
	
	void checkBalance()
	{
		System.out.println("Balance is "+amount);
	}
	
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
	public static void main(String[] args)
	{
		BankAccount a1=new BankAccount();
		a1.insert(1004,"sampada",500);
		a1.display();
		a1.checkBalance();
		a1.deposit(2000);
		a1.checkBalance();
		a1.withdraw(200);
		a1.checkBalance();

	}

}
