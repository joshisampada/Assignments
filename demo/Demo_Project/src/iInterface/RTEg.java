package iInterface;

interface Printable1
{
	void print();
}

interface Showable1
{
	void print();
}

public class RTEg implements Printable1,Showable1
{
	public void print()
	{
		System.out.println("printed");
	}
	
	
	
	public static void main(String[] args)
	{
		RTEg e1=new RTEg();
		e1.print();
		

	}

}
