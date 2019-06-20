package abstraction;

abstract class Bike1
{
	Bike1()
	{
		System.out.println("bike is created");
	}
	
	abstract void run1();
	
	void changeGear()
	{
		System.out.println("gear changed");
	}  
}

class Honda extends Bike1
{  
	void run1()
	{
		System.out.println("running safely..");
	}  
} 

public class AbstractVehicle 
{
	
	public static void main(String[] args) 
	{
		Bike1 obj = new Honda();  
		obj.run1();  
		obj.changeGear();  

	}

}
