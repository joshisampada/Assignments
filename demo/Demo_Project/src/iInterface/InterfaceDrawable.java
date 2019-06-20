package iInterface;

interface drawable
{
	void draw();
}

class rectangle implements drawable
{
	public void draw()
	{
		System.out.println("Rectangle is drawn");
	}
}

class Circle implements drawable
{
	public void draw()
	{
		System.out.println("Circle is drawn");
	}
}

public class InterfaceDrawable 
{

	public static void main(String[] args)
	{
		drawable c1=new Circle(); //or Circle c1=new Circle(first one is there if anyone else make interface)
		c1.draw();

	}

}
