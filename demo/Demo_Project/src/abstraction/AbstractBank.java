package abstraction;

abstract class Bank
{
	abstract int getRateOfInterest();
	
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

class PNB extends Bank
{    
     int getRateOfInterest()
     {
    	 return 8;
     }    
}  


public class AbstractBank
{

	public static void main(String[] args) 
	{
		Bank b1;
		
		b1=new SBI();  
		System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");
		
		b1=new PNB();  
		System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");   

	}

}
