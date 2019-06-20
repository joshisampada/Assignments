package iInterface;

interface printable
{
	void print();
}

public class InterfaceSimpleEg implements printable
{
	public void print() 
	{
	System.out.println("It is printing");	
	}
	
	public static void main(String[] args) 
	{
		InterfaceSimpleEg i1=new InterfaceSimpleEg();
		i1.print();

	}

}
