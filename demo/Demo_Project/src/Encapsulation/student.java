package Encapsulation;

public class student
{
	private String name;
	
	public String getName()
	{  
		return name;  
	}
	
	public void setName(String name)
	{  
		this.name=name;
	}
	
	public static void main(String[] args)
	{
		student s1 =new student();
		s1.setName("vijay");
		System.out.println(s1.getName());
		

	}

}
