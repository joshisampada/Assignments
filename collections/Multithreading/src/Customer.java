
public class Customer
{

	public static void main(String[] args) 
	{
		Account a = new Account();
		AccountHolder ac = new AccountHolder(a);
		Thread t1=new Thread(ac);
		Thread t2=new Thread(ac);
		t1.setName("Sam");
		t2.setName("Swap");
		
		t1.start();
		t2.start();
		
		
		

	}

}
