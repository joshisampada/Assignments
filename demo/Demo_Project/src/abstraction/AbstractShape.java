package abstraction;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}  
}

public class AbstractShape 
{

	public static void main(String[] args) 
	{
		Shape s1=new Circle();
		s1.draw();
	}

}
