package polymorphism;

public class RunTimePolyAnimal 
{
	void eat()
	{
		System.out.println("eating...");
	}  
}  


class Dog extends RunTimePolyAnimal
{  
	void eat()
	{
		System.out.println("eating bread...");
	}  
}  


class Cat extends RunTimePolyAnimal
{  
	void eat()
	{
		System.out.println("eating rat...");
	}  
}


class Lion extends RunTimePolyAnimal
	{  
	void eat()
	{
		System.out.println("eating meat...");
	}  

}
