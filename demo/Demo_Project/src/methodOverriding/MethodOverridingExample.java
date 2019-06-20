package methodOverriding;


class Vehicle1
{
	void run()
	{
		System.out.println("Vehicle is running");
	}  
}


public class MethodOverridingExample extends Vehicle1
{
	void run()
	{
		System.out.println("Bike is running safely");
	}
	public static void main(String[] args)
	{
		MethodOverridingExample obj = new MethodOverridingExample();//creating object  
		obj.run();//calling method  
		/*Vehicle1 v1=new Vehicle1();
		v1.run();*/
	}

}
