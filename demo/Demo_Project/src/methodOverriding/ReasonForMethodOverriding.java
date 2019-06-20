package methodOverriding;

//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Vehicle
{  
   void run()
   {
	   System.out.println("Vehicle is running");
   }  
}  

//Creating a child class  
  
   public class ReasonForMethodOverriding extends Vehicle
    {
	   public static void main(String[] args)
	   	{
		 //creating an instance of child class  
		   ReasonForMethodOverriding obj = new ReasonForMethodOverriding();  
		   //calling the method with child class instance  
		   obj.run();  
	   	}

}

   //Problem is that I have to provide a specific implementation of run() method in subclass that is why we use method overriding.