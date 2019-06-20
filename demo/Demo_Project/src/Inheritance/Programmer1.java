package Inheritance;

public class Programmer1 extends SimpleInheritanceExample
{
	int bonus=10000;  
	public static void main(String[] args) 
	{
		//Simple program
		/*Programmer1 p=new Programmer1();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus);*/  

		//Single inheritance
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
	}

}
