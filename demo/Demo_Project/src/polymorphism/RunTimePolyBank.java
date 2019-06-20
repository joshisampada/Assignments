package polymorphism;

public class RunTimePolyBank 
{
	float getRateOfInterest()
	{
		return 0;
	}  
}  
	

class SBI extends RunTimePolyBank
{  
	float getRateOfInterest()
	{
		return 8.4f;
	}  
}  


class ICICI extends RunTimePolyBank
{  
	float getRateOfInterest()
	{
		return 7.3f;
	}  
}  


class AXIS extends RunTimePolyBank
{  
	float getRateOfInterest()
	{
		return 9.7f;
	}  
}  


