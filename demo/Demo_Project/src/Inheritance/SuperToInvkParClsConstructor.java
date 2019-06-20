package Inheritance;


class World
{
	World()
	{
		System.out.println("World is created");
	}
}

class Country extends World
{
	Country()
	{
		super();
		System.out.println("Country is created");
	}
}


public class SuperToInvkParClsConstructor 
{

	public static void main(String[] args) 
	{
		Country c=new Country();

	}

}
