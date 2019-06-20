package polymorphism;

public class RunTimePolyShape 
{
	void draw()
	{
		System.out.println("drawing...");
	}  
}  


class Rectangle extends RunTimePolyShape
{  
	void draw()
	{
		System.out.println("drawing rectangle...");
	}  
}  
	

class Circle extends RunTimePolyShape
{  
	void draw()
	{
		System.out.println("drawing circle...");
	}  
}  


class Triangle extends RunTimePolyShape
{  
	void draw()
	{
		System.out.println("drawing triangle...");
	}  
}  

