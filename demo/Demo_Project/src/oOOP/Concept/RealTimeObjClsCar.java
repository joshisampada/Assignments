package oOOP.Concept;

public class RealTimeObjClsCar
{
	String model;
	String color;
	int mileage;
	
	RealTimeObjClsCar(String m,String c,int mi)
	{
		model=m;
		color=c;
		mileage=mi;
	}
	
	public void startCar()
	{
		System.out.println("Car starts");
		
	}
	
	public void changeGear()
	{
		System.out.println("Gears are changed");
		
	}
	
	public void stopCar()
	{
		System.out.println("Car stopped");
	}
	
	/*public String getInfo()
	{
		 return(“Model:”+model+ “Colour:” +colour+ “Mileage:” +mileage);
	}*/
	
	public void display()
	{
		System.out.println(model+ " Model " +color+ " Color " +mileage+ " Mileage ");
	}
	
	public static void main(String[] args)
	{
		RealTimeObjClsCar r1=new RealTimeObjClsCar("Suzuki","red",110);
		r1.display();
		//System.out.println(r1.getInfo());
		r1.startCar();
		

	}

}
