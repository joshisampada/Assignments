package abstraction;

abstract class bike
{
	abstract void run();
}
public class abstractClsWithAbsMethod extends bike
{
	void run()
	{
		System.out.println("running safely");
	
	}

	public static void main(String[] args) 
	{

		bike obj1=new abstractClsWithAbsMethod();
		obj1.run();

	}

}
