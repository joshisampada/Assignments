package iInterface;

interface i1
{
	void print();
}

interface i2 extends i1
{
	void show();
}
public class InheritanceInInterface implements i2 
{
	public void print()
	{
		System.out.println("Hello");
	}  
	
	public void show()
	{
		System.out.println("Welcome");
	}  
	
	public static void main(String[] args) 
	{
		InheritanceInInterface obj = new InheritanceInInterface();  
		obj.print();  
		obj.show();  	

	}

}
