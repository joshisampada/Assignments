package Inheritance;

class Zoo
{
	String color="white";
}

class Pet extends Zoo
{
	String color="black";  
	
	void printColor()
	{  
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class  
	}
}

	public class SuperToRfrImmeParentClass 
{

	public static void main(String[] args) 
	{
		Pet d=new Pet();
		d.printColor();

	}

}
