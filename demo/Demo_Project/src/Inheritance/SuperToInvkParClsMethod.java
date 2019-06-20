package Inheritance;

class Jungle
{
	void eat()
	{
		System.out.println("eating..........");
	}
}

class Lion extends Jungle
{
	void eat()
	{
		System.out.println("eating bread.......");
	}
	
	void bark()
	{
		System.out.println("barking...........");
	}
	
	void work()
	{
		eat();
		super.eat();
		bark();
	}
}


public class SuperToInvkParClsMethod
{

	public static void main(String[] args)
	{
		Lion l=new Lion();
		l.work();

	}

}
