package iInterface;

interface Bank
{
	float rateOfInterest();
}

class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 7f;
	}
}

class PNB implements Bank
{
	public float rateOfInterest()
	{
		return 8;
	}
}


public class InterfaceBank 
{

	public static void main(String[] args)
	{
		Bank b;
		b=new SBI();
		b.rateOfInterest();
		System.out.println("ROI:"+b.rateOfInterest());
		
		b=new PNB();
		b.rateOfInterest();
		System.out.println("ROI:"+b.rateOfInterest());

	}

}
