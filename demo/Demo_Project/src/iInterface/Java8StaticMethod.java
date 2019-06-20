package iInterface;


interface Drawable5
{  
   void draw();  
   static int cube(int x)
   {
	   return x*x*x;
   }  
}  

class Rectangle5 implements Drawable5
{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
  
class Java8StaticMethod
{  
	public static void main(String args[])
	{  
		Drawable5 d=new Rectangle5();  
		d.draw();  
		System.out.println(Drawable5.cube(3));  
	}
}  

