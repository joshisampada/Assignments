package methodOverriding;

public class BankRealTimeExample 
{
	int getRateOfInterest()
	{
		return 0;
	}  
}  
	//Creating child classes.  
	class SBI extends BankRealTimeExample
	{  
	    int getRateOfInterest()
	     {
		    return 8;
		 }  
	}
	  
	class ICICI extends BankRealTimeExample
	{  
		int getRateOfInterest()
		{
			return 7;
		}  
	}  
	
	class AXIS extends BankRealTimeExample
	{  
	   int getRateOfInterest()
	   {
		   return 9;
	   }  
	}  
	
	
	

