package Constructor;

public class ConstructorOverloading
{

	int id;
	String name;
	int age;
	
	ConstructorOverloading(int i,String n)
	{
		id=i;
		name=n;
	}
	
	ConstructorOverloading(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	
	public void display()
	{
		System.out.println("The id of a student is: " +id + " ,name is: "+name+ " ,age is: "+age);
	}
	public static void main(String[] args) 
	{
		ConstructorOverloading c1=new ConstructorOverloading(11,"nalu");
		c1.display();
		ConstructorOverloading c2=new ConstructorOverloading(12,"salma",22);
		c2.display();
	}

}
