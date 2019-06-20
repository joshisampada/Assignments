package instanceofOperator;

class instance1
{
	
}

public class instanceofDowncasting extends instance1 
{
	static void method(instance1 i)
	{
		if(i instanceof instanceofDowncasting)
		{
			instanceofDowncasting o=(instanceofDowncasting)i;
			System.out.println("ok downcasting performed");
		}
	}

	public static void main(String[] args) 
	{
		instance1 i=new instanceofDowncasting();
		instanceofDowncasting.method(i);

	}

}
