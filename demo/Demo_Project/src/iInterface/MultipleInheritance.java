package iInterface;

interface Hello
{
	void print();
}

interface Showable
{
	void show();
}



public class MultipleInheritance implements Hello,Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	
	public void show()
	{
		System.out.println("Welcome");
	}



	public static void main(String[] args) 
	{
		MultipleInheritance d1=new MultipleInheritance();
		d1.print();
		d1.show();

	}

}
