package instanceofOperator;

class instance2
{
	
}

public class DwncstngWithoutInstanceof extends instance2 
{
	static void method(instance2 u)
	{
		DwncstngWithoutInstanceof d=(DwncstngWithoutInstanceof)u;
		System.out.println("ok downcasting is performed");
	}
	
	public static void main(String[] args) 
	{
		instance2 u=new DwncstngWithoutInstanceof();
		DwncstngWithoutInstanceof.method(u);
	}
}
