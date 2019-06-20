package Constructor;

public class DefConstructorDefValDisp
{
	int id;
	String name;
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		DefConstructorDefValDisp d1 = new DefConstructorDefValDisp();
		d1.display();
		DefConstructorDefValDisp d2 = new DefConstructorDefValDisp();
		d2.display();
			

	}

}
