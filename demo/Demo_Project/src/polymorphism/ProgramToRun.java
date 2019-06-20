package polymorphism;

public class ProgramToRun 
{

	public static void main(String[] args) 
	{
		RunTimePolyBike b = new Splendor();//upcasting  
		 b.run();  

		 RunTimePolyBank p;  
		 p=new SBI();  
		 System.out.println("SBI Rate of Interest: "+p.getRateOfInterest());  
		 p=new ICICI();  
		 System.out.println("ICICI Rate of Interest: "+p.getRateOfInterest());  
		 p=new AXIS();  
		 System.out.println("AXIS Rate of Interest: "+p.getRateOfInterest());  
		 
		 RunTimePolyShape s;  
		 s=new Rectangle();  
		 s.draw();  
		 s=new Circle();  
		 s.draw();  
		 s=new Triangle();  
		 s.draw();
		 	
		 RunTimePolyAnimal a;  
		 a=new Dog();  
		 a.eat();  
		 a=new Cat();  
		 a.eat();  
		 a=new Lion();  
		 a.eat();  
		 
		 CantAchievePolyDataMembers obj=new Honda3();  
		  System.out.println(obj.speedlimit);//90  
		  
		  RPMultilevelInheritance a1,a2,a3;  
		  a1=new RPMultilevelInheritance();  
		  a2=new Class();  
		  a3=new BabyDog();  
		  a1.eat();  
		  a2.eat();  
		  a3.eat(); 
	}

}
