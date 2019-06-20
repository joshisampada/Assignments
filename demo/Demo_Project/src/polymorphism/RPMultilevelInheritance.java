package polymorphism;

public class RPMultilevelInheritance 
{
	void eat()
	{
		System.out.println("eating");
	}  
}  


class Class extends RPMultilevelInheritance
{  
	void eat()
	{
		System.out.println("eating fruits");
	}  
}  
	

class BabyDog extends Class
{  
	void eat()
	{
		System.out.println("drinking milk");
	}  
}
