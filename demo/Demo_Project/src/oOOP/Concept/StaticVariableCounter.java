package oOOP.Concept;

public class StaticVariableCounter
{
	static int count=0;
	
	StaticVariableCounter()
	{
	  count++;
	  System.out.println(count);
	}
	
	
	public static void main(String[] args)
	{
		StaticVariableCounter s1=new StaticVariableCounter();
		StaticVariableCounter s2=new StaticVariableCounter();
		StaticVariableCounter s3=new StaticVariableCounter();

	}

}
