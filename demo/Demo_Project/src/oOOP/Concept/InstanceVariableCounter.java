package oOOP.Concept;

public class InstanceVariableCounter
{
	int count=0;
	
	InstanceVariableCounter()
	{
		count++;
		System.out.println(count);
	}
	
	
	public static void main(String[] args)
	{
		InstanceVariableCounter c1=new InstanceVariableCounter();
		InstanceVariableCounter c2=new InstanceVariableCounter();
		InstanceVariableCounter c3=new InstanceVariableCounter();
	}

}
