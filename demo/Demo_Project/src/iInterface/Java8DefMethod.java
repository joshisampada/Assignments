package iInterface;

interface Def
{
	void print();
	
	default void msg()
	{
		System.out.println("msg printed");
	}
}

class Hi implements Def
{
	public void print()
	{
		System.out.println("Printed everywhere");
	}
}

public class Java8DefMethod
{

	public static void main(String[] args) 
	{
		Def d=new Hi();
		d.print();
		d.msg();

	}

}
